/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.util.List;
import mx.gob.imss.dpes.common.exception.BusinessException;


/**
 *
 * @author eduardo.montesh
 */
public class UnknowException extends BusinessException {
    public final static String KEY = "msg352";
    
    public UnknowException() {
        super(KEY);
    }
    
    public UnknowException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public UnknowException(String causa) {
        super(causa);
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
