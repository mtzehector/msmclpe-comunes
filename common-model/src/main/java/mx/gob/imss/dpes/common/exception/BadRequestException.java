package mx.gob.imss.dpes.common.exception;

public class BadRequestException extends BusinessException{
  private final static String KEY = "err400";
  
  public BadRequestException() {
    super(KEY);
  }
  public BadRequestException(String resource) {
    super(resource);
  }
}
