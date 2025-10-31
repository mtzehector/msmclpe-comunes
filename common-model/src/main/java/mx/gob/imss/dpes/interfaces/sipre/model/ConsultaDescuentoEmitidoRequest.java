package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class ConsultaDescuentoEmitidoRequest extends BaseModel {

    @Getter
    @Setter
    private String periodoNomina;

    public ConsultaDescuentoEmitidoRequest() {
    }

    public ConsultaDescuentoEmitidoRequest(String periodoNomina) {
        this.periodoNomina = periodoNomina;
    }

}
