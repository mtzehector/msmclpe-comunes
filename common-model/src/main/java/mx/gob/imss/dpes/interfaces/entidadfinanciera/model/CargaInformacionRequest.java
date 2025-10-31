package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class CargaInformacionRequest extends BaseModel {

    @Getter
    @Setter
    private String periodo;

}
