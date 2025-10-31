package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;


public class SelloElectronicoRequest extends BaseModel {
  @Getter @Setter String cadenaOriginal;
  @Getter @Setter String rfc =".";
}
