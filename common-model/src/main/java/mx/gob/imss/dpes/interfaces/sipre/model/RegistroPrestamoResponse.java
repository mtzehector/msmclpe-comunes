/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.interfaces.sistrap.model.SistrapResponse;

/**
 *
 * @author antonio
 */
public class RegistroPrestamoResponse extends SistrapResponse {

    @Getter
    @Setter
    private String exito;
    @Getter
    @Setter
    private String codigoError;
    @Getter
    @Setter
    private String mensajeError;
}
