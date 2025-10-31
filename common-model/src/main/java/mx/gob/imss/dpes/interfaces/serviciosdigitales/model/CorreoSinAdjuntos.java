package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class CorreoSinAdjuntos extends BaseModel {
  @Getter @Setter private List<String> correoPara = new ArrayList<>();
  @Getter @Setter private String asunto;
  @Getter @Setter private String remitente;
  @Getter @Setter private String cuerpoCorreo;
}
