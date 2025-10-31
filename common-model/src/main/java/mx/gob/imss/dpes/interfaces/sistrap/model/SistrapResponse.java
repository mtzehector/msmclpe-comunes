/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author antonio
 */
public class SistrapResponse extends BaseModel {

    @Getter
    @Setter
    private String codigoError;
    
    @Getter
    @Setter
    private String mensajeError;

    public SistrapResponse() {
    }

    public SistrapResponse(String codigoError, String mensajeError) {
        this.codigoError = codigoError;
        this.mensajeError = mensajeError;
    }
    
}
