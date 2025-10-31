/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

/**
 *
 * @author gabriel.rios
 */
public class RenapoBDTUException extends BusinessException {
    public final static String KEY = "msg1346";
    public final static String INVALID_CURP = "msg1357";
    public final static String INVALID_NSS = "msg1358";
    public final static String INVALID_DATA = "msg1359";
    
    public RenapoBDTUException() {
        super(KEY);
    }
    
    public RenapoBDTUException(String causa) {
        super(causa);
    }
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
