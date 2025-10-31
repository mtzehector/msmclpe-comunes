package mx.gob.imss.dpes.interfaces.catalogo;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.BitacoraEnum;
import mx.gob.imss.dpes.common.enums.TipoEstadoSolicitudEnum;
import mx.gob.imss.dpes.common.model.BaseModel;

public class Parametro extends BaseModel {

    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    String parametro;

    @Getter
    @Setter
    String valor;

}
