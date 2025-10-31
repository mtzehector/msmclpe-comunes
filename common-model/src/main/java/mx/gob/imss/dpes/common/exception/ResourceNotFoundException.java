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
public class ResourceNotFoundException extends BusinessException {
    public final static String KEY = "msg367";
    
    public ResourceNotFoundException() {
        super(KEY);
    }
    
    public ResourceNotFoundException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public ResourceNotFoundException(String causa) {
        super(causa);
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
