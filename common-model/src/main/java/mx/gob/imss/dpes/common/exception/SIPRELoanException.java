/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.gob.imss.dpes.common.model.Message;

/**
 *
 * @author eduardo.montesh
 */
public class SIPRELoanException extends BusinessException {
    protected final Logger log = Logger.getLogger( getClass().getName() );
    public final static String KEY = "msg358";
    
    public SIPRELoanException() {
        super(KEY);
    }
    
    public SIPRELoanException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public SIPRELoanException(String causa) {
        super(causa);
    }
    
    public SIPRELoanException(int codigoError) {
        switch(codigoError){
            case 401:
                this.messageKey="msg355";
                break;
            case 400:
                this.messageKey="msg356";
                break;
            case 500:
                this.messageKey="msg357";
                break;
            default:
                this.messageKey="msg358";
                break;
        }
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
