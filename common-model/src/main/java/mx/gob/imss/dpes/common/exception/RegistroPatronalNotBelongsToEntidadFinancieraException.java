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
public class RegistroPatronalNotBelongsToEntidadFinancieraException extends BusinessException {

    public final static String KEY = "msg360";

    public RegistroPatronalNotBelongsToEntidadFinancieraException() {
        super(KEY);
    }

    public RegistroPatronalNotBelongsToEntidadFinancieraException(List parameters) {
        super(KEY);
        super.addParameters(parameters);

    }

    public RegistroPatronalNotBelongsToEntidadFinancieraException(String causa) {
        super(causa);
    }

    @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
