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
 * @author cesar.leon
 */
public class Pension extends BaseModel{
    
    @Getter @Setter private String idNss;
    @Getter @Setter private String idGrupoFamiliar;
    @Getter @Setter private String idTipoPension;
    @Getter @Setter private Integer idRegimen;
    @Getter @Setter private String tipoTrabajador;
    @Getter @Setter private String numTelefono;
    @Getter @Setter private String desTipoPension;
    @Getter @Setter private String idIncidencia;
}
