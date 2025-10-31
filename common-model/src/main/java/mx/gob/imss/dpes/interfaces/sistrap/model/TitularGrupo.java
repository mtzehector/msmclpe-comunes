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
public class TitularGrupo extends BaseModel{  
  @Getter @Setter private String idNss;
  @Getter @Setter private String idGrupoFamiliar;
  @Getter @Setter private String nomApellidoPaterno;
  @Getter @Setter private String nomApellidoMaterno;
  @Getter @Setter private String nomNombre;
  @Getter @Setter private String cveCurp;
  @Getter @Setter private String fecNacimiento;
  @Getter @Setter private Integer idTipoValidacion;
  @Getter @Setter private String numClabe;  
  @Getter @Setter private Integer idTipoCuentaPago;
  @Getter @Setter private String cveCtaPago;
}
