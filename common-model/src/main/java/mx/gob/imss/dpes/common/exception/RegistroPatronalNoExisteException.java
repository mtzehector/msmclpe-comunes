/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.util.List;

/**
 *
 * @author marco.gutiertrez
 */
public class RegistroPatronalNoExisteException extends BusinessException {
    public final static String KEY = "msg371";
    
    public RegistroPatronalNoExisteException() {
        super(KEY);
    }
    
    public RegistroPatronalNoExisteException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public RegistroPatronalNoExisteException(String causa) {
        super(causa);
    }
    
     @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
