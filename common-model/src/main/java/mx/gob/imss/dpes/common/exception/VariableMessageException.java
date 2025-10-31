package mx.gob.imss.dpes.common.exception;

import lombok.Getter;
import lombok.Setter;

public class VariableMessageException extends BusinessException{
  @Getter @Setter String variableMessage;
  
  public VariableMessageException(String message) {
    this.variableMessage = message;
  }
  
  @Override
    public String getMessage() {
        return variableMessage;
    }
}
