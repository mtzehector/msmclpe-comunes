package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class CurpRequest extends BaseModel {

    public CurpRequest() {
    }

    public CurpRequest(String curp) {
        this.curp = curp;
    }

    @Getter
    @Setter
    private String curp;

}
