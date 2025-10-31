package mx.gob.imss.dpes.common.exception;

public class AlternateFlowException extends BusinessException {

  public AlternateFlowException(String messageKey) {
    super(messageKey);
  }
    
    
    public AlternateFlowException() {
        this.messageKey = "alt001";
    }

}
