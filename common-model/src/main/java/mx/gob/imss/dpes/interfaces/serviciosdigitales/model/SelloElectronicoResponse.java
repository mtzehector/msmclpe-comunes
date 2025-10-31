package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;


public class SelloElectronicoResponse extends BaseModel {

    @Getter @Setter private String cadenaOriginal;
    @Getter @Setter private String sello;
    @Getter @Setter private String id;
    @Getter @Setter private String noSerie;
}
