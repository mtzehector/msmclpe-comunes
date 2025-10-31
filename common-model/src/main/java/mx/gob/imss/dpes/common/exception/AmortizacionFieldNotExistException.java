/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.util.List;

/**
 *
 * @author eduardo.montesh
 */
public class AmortizacionFieldNotExistException extends BusinessException {
    public final static String KEY = "msg349";
    public final static String CVE_SOLICITUD = "msg362";
    public final static String FOLIO_SIPRE = "msg363";
    public final static String FOLIO_SIPRE_CAPITAL_INSOLUTO = "msg364";
    public final static String CVE_SOLICITUD_NOT_GIVEN = "msg365";
    public final static String FOLIO_SIPRE_NOT_GIVEN = "msg366";
    
    
    public AmortizacionFieldNotExistException() {
        super(KEY);
    }
    
    public AmortizacionFieldNotExistException(List parameters) {
       super(KEY);
       super.addParameters(parameters);
               
    }
    public AmortizacionFieldNotExistException(String causa) {
        super(causa);
    }
    
     @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
