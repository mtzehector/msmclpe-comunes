package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class RespuestaBoveda extends BaseModel {

    @Getter
    @Setter
    private boolean exito;

    @Getter
    @Setter
    private String clave;

    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    private String idDocumento;

    @Getter
    @Setter
    private String codigoError;

    @Getter
    @Setter
    private String descripcionError;

    @Getter
    @Setter
    private byte[] archivo;

}
