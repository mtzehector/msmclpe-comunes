package mx.gob.imss.dpes.common.exception;

/**
 * Excepción al comparar datos Renapo vs Sistrap
 * @author luisr.rodriguez
 */
public class RenapoVsSistrapNoMacthingException extends BusinessException{
    public final static String KEY = "msg059";
    
    public RenapoVsSistrapNoMacthingException() {
        super(KEY);
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
