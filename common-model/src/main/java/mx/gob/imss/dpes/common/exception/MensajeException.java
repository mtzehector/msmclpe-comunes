package mx.gob.imss.dpes.common.exception;

public class MensajeException extends BusinessException {
  public final static String MENSAJE_DE_SOLICITUD_INCORRECTO = "msg501";

  public MensajeException() {super(MENSAJE_DE_SOLICITUD_INCORRECTO);
  }
  public MensajeException(String resource) {
    super(resource);
  }
}
