
package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class ClabeNominaAnterior extends BaseModel{
  @Getter @Setter private String idNss;
  @Getter @Setter private String idGrupoFamiliar;
  @Getter @Setter private String fecPeriodoNomina;  
  @Getter @Setter private String clabe;
}
