package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.renapo.model.RenapoCurpOut;

/**
 *
 * @author eduardo.loyo
 */
@Data
public class PersonaResponse extends BaseModel {

    private String cveCurp;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String desEstadoPersonaEf;
    private Long cveEntidadFinanciera;
    private String correoElectronico;
    private String telLocal;
    private String telCelular;
    private Long cvePersona;
    private  Long baja;
    private Long idEstadoPersonaEF;
    private String imgB64;
    private Integer cveSexo;
    private RenapoCurpOut renapoOut;
    private Long firmaCartaRecibo;
}
