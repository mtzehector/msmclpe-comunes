package mx.gob.imss.dpes.interfaces.persona.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 * Modelo de persona SIPRE
 * @author luisr.rodriguez
 */
@Data
public class PersonaModel extends BaseModel {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telLocal;
    private String telCelular;
    private String correoElectronico;
    private Long   id;
}
