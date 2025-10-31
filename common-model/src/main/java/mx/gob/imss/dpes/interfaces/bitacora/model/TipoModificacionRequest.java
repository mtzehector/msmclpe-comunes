package mx.gob.imss.dpes.interfaces.bitacora.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

@Data
public class TipoModificacionRequest extends BaseModel {

    private Long cveTipoModificacion;
    private String nombreTipoModificacion;

}
