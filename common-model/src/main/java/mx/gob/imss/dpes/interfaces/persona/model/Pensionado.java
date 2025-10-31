package mx.gob.imss.dpes.interfaces.persona.model;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author luisr.rodriguez
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pensionado extends BaseModel {
    private String cvePersona;
    private String cveCurp;
    private String numNss;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico; 
    private String telCelular;
    private String telLocal;
}
