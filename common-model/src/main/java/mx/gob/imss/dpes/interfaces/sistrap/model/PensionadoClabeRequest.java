package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class PensionadoClabeRequest extends BaseModel {

    public PensionadoClabeRequest() {
    }

    public PensionadoClabeRequest(String idNss, String idGrupoFamiliar) {
        this.idNss = idNss;
        this.idGrupoFamiliar = idGrupoFamiliar;
    }

    @Getter
    @Setter
    private String idNss;
    @Getter
    @Setter
    private String idGrupoFamiliar;
    @Getter
    @Setter
    private String clabe;
}
