package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class TelefonoReinstalacionPrestamo extends BaseModel {

    @Getter
    @Setter
    private Integer tipoNumero;

    @Getter
    @Setter
    private Integer lada;

    @Getter
    @Setter
    private Long numero;
}
