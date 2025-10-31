package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class ConsultaCapacidadRequest extends BaseModel {

    @Getter
    @Setter
    private String nss;
    @Getter
    @Setter
    private String grupoFamiliar;

    public ConsultaCapacidadRequest(String nss, String grupoFamiliar) {
        this.nss = nss;
        this.grupoFamiliar = grupoFamiliar;
    }

    public ConsultaCapacidadRequest() {
    }

}
