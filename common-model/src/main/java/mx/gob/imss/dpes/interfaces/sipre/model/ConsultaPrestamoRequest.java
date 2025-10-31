
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;


public class ConsultaPrestamoRequest extends BaseModel{
  @Getter @Setter private String idNss;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private String numFolio;
  @Getter @Setter private String idPeriodo;
}
