package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class CurpRequestAux extends BaseModel {

    public CurpRequestAux() {
    }

    public CurpRequestAux(String curp) {
        this.curp = curp;
    }

    @Getter
    @Setter
    private String curp;
    @Getter
    @Setter
    private Long sesion;
}
