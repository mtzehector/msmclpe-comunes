/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.domicilio.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author eduardo.loyo
 */
@Data
public class EntidadFederativa extends BaseModel {

    private String idRenapo;
    private String claveRenapo;
    private String clave;
    private String nombre;
    private String municipios;
    private String errorFormGeneral;
    private String checked;
}
