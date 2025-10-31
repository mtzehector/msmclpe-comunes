package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.interfaces.sistrap.model.SistrapResponse;

public class ConsultaDatosTitularResponse extends SistrapResponse {
    @Getter
    @Setter
    private ConsultaDatosPersonalesTitularVO consultaDatosPersonalesTitularVO;
}
