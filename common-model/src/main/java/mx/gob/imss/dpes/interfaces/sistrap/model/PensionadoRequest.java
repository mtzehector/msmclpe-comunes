package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class PensionadoRequest extends BaseModel {

    public PensionadoRequest() {
    }

    public PensionadoRequest(String idNss, String idGrupoFamiliar) {
        this.idNss = idNss;
        this.idGrupoFamiliar = idGrupoFamiliar;
    }

    @Getter
    @Setter
    private String idNss;
    @Getter
    @Setter
    private String idGrupoFamiliar;

}
