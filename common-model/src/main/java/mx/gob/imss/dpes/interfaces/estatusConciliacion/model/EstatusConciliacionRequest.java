package mx.gob.imss.dpes.interfaces.estatusConciliacion.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class EstatusConciliacionRequest extends BaseModel {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String periodo;
    @Getter
    @Setter
    private Boolean activo;
}
