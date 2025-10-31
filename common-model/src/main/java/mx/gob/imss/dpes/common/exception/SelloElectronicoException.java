package mx.gob.imss.dpes.common.exception;

public class SelloElectronicoException extends BusinessException {
  private final static String KEY = "err003";

  public SelloElectronicoException() {super(KEY);
  }
  public SelloElectronicoException(String resource) {
    super(resource);
  }
}
