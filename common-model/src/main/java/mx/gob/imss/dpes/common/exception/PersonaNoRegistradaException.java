/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import mx.gob.imss.dpes.common.exception.BusinessException;

/**
 *
 * @author antonio
 */
public class PersonaNoRegistradaException extends BusinessException {

    public final static String KEY = "err001";
    public final static String PATRON = "patron";
    public final static String REG = "regpatron";
    public final static String REGENTIDAD = "regentidad";
    public final static String CVEPERFIL = "cveperfil";
    public final static String TELEFONO = "telefono";
    public final static String CURP_PERSONA_EXISTE_NOTHISEF = "msg11";
    public final static String CURP_PERSONA_EXISTE_NOEF = "msg12";
    public final static String PERSONA_EXISTE_NOTHISEF = "msg13";
    public final static String PERSONA_EXISTE = "msg14";
    public final static String PERSONA_EXISTE_NOTHISEF_AS_OPERATOR = "msg15";
    public final static String PERSONA_EXISTE_NOTHISEF_AS_PROMOTOR = "msg16";
    

    public PersonaNoRegistradaException() {
        super(KEY);
    }

    public PersonaNoRegistradaException(String causa) {
        super(causa);
    }
    
    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }

}
