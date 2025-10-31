
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;


public class ConsultaPrestamosEnCursoRequest extends BaseModel{
  @Getter @Setter private String nss;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private String periodoNomina;
}
