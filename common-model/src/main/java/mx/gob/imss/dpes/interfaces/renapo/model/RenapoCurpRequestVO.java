package mx.gob.imss.dpes.interfaces.renapo.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.SecureModel;

@Getter
@Setter
public class RenapoCurpRequestVO extends SecureModel {
    private  RenapoCurpIn renapoCurpIn = new RenapoCurpIn();
    private  RenapoCurpOut renapoCurpOut = new RenapoCurpOut();
}
