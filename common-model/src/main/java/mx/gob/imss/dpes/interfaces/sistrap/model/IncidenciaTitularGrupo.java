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
public class IncidenciaTitularGrupo extends BaseModel{  
  @Getter @Setter private String idNss;
  @Getter @Setter private String idGrupoFamiliar;
  @Getter @Setter private String curp;
  @Getter @Setter private String idIncidencia;  
}
