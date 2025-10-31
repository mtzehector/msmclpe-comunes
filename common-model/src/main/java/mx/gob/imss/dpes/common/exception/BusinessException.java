package mx.gob.imss.dpes.common.exception;

import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class BusinessException extends Exception {

    @Getter @Setter String messageKey;
    List<Object> exceptionParameters=new LinkedList();
    

    public BusinessException(String messageKey) {
        this.messageKey = messageKey;
    }
    
    public BusinessException() {
        this.messageKey = "error001";
    }
    
    public void addParameters(List parameters){
        exceptionParameters.addAll(parameters);
    }

    public Object[] getParameters() {
       return exceptionParameters.toArray();
    }

    @Override
    public String getMessage() {
        return MessageResolver.getMessage(messageKey, getParameters());
    }
}
