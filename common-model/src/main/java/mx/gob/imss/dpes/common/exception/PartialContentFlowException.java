package mx.gob.imss.dpes.common.exception;

public class PartialContentFlowException extends BusinessException {
  public PartialContentFlowException(String messageKey) {
    super(messageKey);
  }

  public PartialContentFlowException() {
        this.messageKey = "alt001";
    }

  @Override
  public String getMessage() {
    String message = this.getMessageKey();
    if (message != null && !message.trim().isEmpty())
      return message;
    else
      return this.getMessageKey();
  }
}
