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
public class Municipio extends BaseModel {

    private String clave;
    private String nombre;
    private EntidadFederativa entidadFederativa;
    private String localidades;
    private String errorFromGeneral;
    private String checked;
}
