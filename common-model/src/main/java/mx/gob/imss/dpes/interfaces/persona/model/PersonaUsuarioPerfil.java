package mx.gob.imss.dpes.interfaces.persona.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.util.Objects;

public class PersonaUsuarioPerfil extends BaseModel {

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private Long conteo;

}
