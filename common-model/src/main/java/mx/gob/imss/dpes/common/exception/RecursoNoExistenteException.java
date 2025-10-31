package mx.gob.imss.dpes.common.exception;

public class RecursoNoExistenteException extends BusinessException{
  private final static String KEY = "err002";
  
  public RecursoNoExistenteException() {
    super(KEY);
  }
  public RecursoNoExistenteException(String resource) {
    super(resource);
  }
}
