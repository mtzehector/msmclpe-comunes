package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;

public class ConsultaCapacidadRequestAux extends ConsultaCapacidadRequest {

    @Getter
    @Setter
    private Long sesion;

    @Getter
    @Setter
    private String token;

}
