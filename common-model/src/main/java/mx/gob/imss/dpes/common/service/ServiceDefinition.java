package mx.gob.imss.dpes.common.service;

import java.io.Serializable;
import java.util.logging.Level;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.exception.RecursoNoExistenteException;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.Notice;
import mx.gob.imss.dpes.common.model.ServiceStatusEnum;

public abstract class ServiceDefinition<I extends BaseModel, O extends Serializable> extends BaseService {

    public Message<O> executeSteps(ServiceDefinition[] steps, Message<O> request) throws BusinessException {
        Message message = request;
        for (ServiceDefinition step : steps) {
            log.log(Level.INFO, "Step: {0}", step.getClass().getName());
//            log.log(Level.INFO, "Message: {0}", request.getPayload());
            message = step.execute(message);
            if (ServiceStatusEnum.EXCEPCION.equals(message.getHeader().getStatus())
                    || ServiceStatusEnum.ALTERNO.equals(message.getHeader().getStatus())
                    || ServiceStatusEnum.PARTIAL_CONTENT.equals(message.getHeader().getStatus())) {
                break;
            }
        }
        return message;
    }

    protected Message<O> onOk(Response response, Message<O> request) {
        log.log(Level.INFO, "Procesando OK {0}", response.getStatus());
        return request;
    }

    protected Message<O> onSeeOther(Response response, Message<O> request) {
        log.log(Level.INFO, "Procesando SeeOther {0}", response.getStatus());
        request.getHeader().setStatus(ServiceStatusEnum.ALTERNO);
        return request;
    }

    public Message<O> response(Response response, Message<O> request) throws BusinessException {
        switch (response.getStatus()) {
            case 200:
                return onOk(response, request);
            case 303:
                log.log(Level.INFO, "onSeeOther:");
                return onSeeOther(response, request);

            default:
                log.log(Level.INFO, "Response {0}", response.getStatus());
                return new Message(request.getPayload(), ServiceStatusEnum.EXCEPCION, new RecursoNoExistenteException(), null);
        }

    }

    public abstract Message<O> execute(Message<I> request) throws BusinessException;

    protected Message<O> response(O payload, ServiceStatusEnum status, BusinessException exception, Notice notice) {
        log.log(Level.INFO, "Se termina servicio {0}", getClass());
        switch (status) {
            case EXCEPCION:
                log.log(Level.INFO, "Como resultado de la peticion se ejecuta un flujo de exepcion {0}", exception.getMessage());
                return new Message<>(payload, ServiceStatusEnum.EXCEPCION, exception, notice);
            case EXITOSO:
                log.log(Level.INFO, "Como resultado de la peticion se ejecuta el flujo principal");
                return new Message<>(payload, status, null, null);
            case ALTERNO:
                log.log(Level.INFO, "Como resultado de la peticion se ejecuta un flujo alterno {0}", status);
                return new Message<>(payload, status, notice);
            case PARTIAL_CONTENT:
                return new Message<>(payload, status, exception, notice);
            default:
                return new Message<>();
        }
    }

}
