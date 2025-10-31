package mx.gob.imss.dpes.common.exception;

public class RequestTokenException extends BusinessException {
  public final static String ERROR_EN_RECUPERACION_TOKEN = "msg500";

  public RequestTokenException() {super(ERROR_EN_RECUPERACION_TOKEN);
  }
  public RequestTokenException(String resource) {
    super(resource);
  }
}
