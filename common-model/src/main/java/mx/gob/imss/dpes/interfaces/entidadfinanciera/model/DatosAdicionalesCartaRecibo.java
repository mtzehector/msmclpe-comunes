package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mx.gob.imss.dpes.common.model.BaseModel;

@Data
@ToString
public class DatosAdicionalesCartaRecibo extends BaseModel{

    @Getter
    @Setter
    String nombre;
}
