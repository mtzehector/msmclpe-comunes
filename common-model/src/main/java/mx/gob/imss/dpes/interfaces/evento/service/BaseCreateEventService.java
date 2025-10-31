/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.evento.service;

import java.util.logging.Level;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.common.enums.EventEnum;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.service.ServiceDefinition;
import mx.gob.imss.dpes.interfaces.evento.model.Evento;

/**
 *
 * @author antonio
 */

public abstract class BaseCreateEventService extends ServiceDefinition<IdentityBaseModel<Long>, IdentityBaseModel<Long>> {

    
    public abstract BaseEventoClient getClient();
    
    public abstract void initEvent(Evento evento);

    @Override
    public Message<IdentityBaseModel<Long>> execute(Message<IdentityBaseModel<Long>> request) throws BusinessException {
        log.log(Level.INFO,"Events");
        log.log( Level.INFO, "Solicitando el Evento: {0}", request.getPayload());
        Evento evento = new Evento();
        initEvent(evento);
        evento.setId( request.getPayload().getId() );        
        Response event = getClient().create(evento);
        return response(event, request);
    }

}
