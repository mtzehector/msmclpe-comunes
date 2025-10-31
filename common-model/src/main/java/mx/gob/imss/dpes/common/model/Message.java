package mx.gob.imss.dpes.common.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.EventEnum;
import mx.gob.imss.dpes.common.exception.BusinessException;



public class Message<M extends Serializable> extends BaseModel {

    @Getter @Setter Header header = new Header();
    @Getter @Setter M payload;

    public static Boolean isException(Message message) {
        return message.getHeader().getStatus().equals(ServiceStatusEnum.EXCEPCION);
    }

    public static Boolean isExito(Message message) {
        return message.getHeader().getStatus().equals(ServiceStatusEnum.EXITOSO);
    }

    public Message(Header header, M payload) {
        this.header = header;
        this.payload = payload;
    }
    
    public Message() {        
        this.header.setStatus(ServiceStatusEnum.REQUEST);
    }
    
    public Message(M payload, EventEnum event) {
        this.payload = payload;        
        this.header.setEvent(event);
        this.header.setStatus(ServiceStatusEnum.REQUEST);
    }

    public Message(M payload) {
        this.payload = payload;        
        this.header.setStatus(ServiceStatusEnum.REQUEST);
    }

    public Message(BusinessException exception) {
        this.header = new Header();
        this.header.setStatus(ServiceStatusEnum.EXCEPCION);
        this.header.setException(exception);
    }

    public Message(M payload, ServiceStatusEnum status, BusinessException exception, Notice notice) {        
        this.payload = payload;
        this.header.setStatus(status);
        this.header.setException(exception);
        this.header.addNotice(notice);
    }

    public Message(M payload, ServiceStatusEnum status, Notice message) {        
        this.payload = payload;
        this.header.setStatus(status);
        this.header.addNotice(message);
    }

}
