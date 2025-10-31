package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class ConsultaDatosTitularRequest extends BaseModel {

    @Getter
    @Setter
    private String nss;

    @Getter
    @Setter
    private String idGrupoFamiliar;

    public ConsultaDatosTitularRequest() {
    }

    public ConsultaDatosTitularRequest(String nss, String idGrupoFamiliar) {
        this.nss = nss;
        this.idGrupoFamiliar = idGrupoFamiliar;
    }
}
