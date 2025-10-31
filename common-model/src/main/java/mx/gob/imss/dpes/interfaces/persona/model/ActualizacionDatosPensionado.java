package mx.gob.imss.dpes.interfaces.persona.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author luisr.rodriguez
 */
@Data
public class ActualizacionDatosPensionado extends BaseModel {
    private Pensionado pensionadoDatosAnteriores;
    private Pensionado pensionadoDatosNuevos;
    private String curp;
    private String numSesion;
    private String token;
}
