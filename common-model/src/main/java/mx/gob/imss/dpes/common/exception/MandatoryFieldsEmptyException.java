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
public class MandatoryFieldsEmptyException extends BusinessException {
    public final static String KEY = "msg351";
    
    public MandatoryFieldsEmptyException() {
        super(KEY);
    }
    
    public MandatoryFieldsEmptyException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public MandatoryFieldsEmptyException(String causa) {
        super(causa);
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
