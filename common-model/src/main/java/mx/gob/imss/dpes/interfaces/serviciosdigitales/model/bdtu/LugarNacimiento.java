/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model.bdtu;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class LugarNacimiento extends BaseModel {
    @Getter @Setter private String clave;
    @Getter @Setter private String claveRenapo;
    @Getter @Setter private String idRenapo;
    @Getter @Setter private String nombre;
    
}