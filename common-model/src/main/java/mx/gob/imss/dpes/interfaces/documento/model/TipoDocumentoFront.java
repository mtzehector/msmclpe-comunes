package mx.gob.imss.dpes.interfaces.documento.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoDocumentoEnum;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 * 
 * @author juan.garfias
 */
public class TipoDocumentoFront extends BaseModel {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String descripcion;

    public TipoDocumentoFront(TipoDocumentoEnum tipoEnum) {
        this.id = tipoEnum.getTipo();
        descripcion = tipoEnum.getDescripcion();
    }

    public TipoDocumentoFront() {
    }

}
