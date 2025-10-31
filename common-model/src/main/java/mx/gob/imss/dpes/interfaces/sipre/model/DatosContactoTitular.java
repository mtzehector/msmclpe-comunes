package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class DatosContactoTitular extends BaseModel {
    @Getter
    @Setter
    private TelefonoReinstalacionPrestamo[] telefonos;

    @Getter
    @Setter
    private String[] correoElectronico;
}
