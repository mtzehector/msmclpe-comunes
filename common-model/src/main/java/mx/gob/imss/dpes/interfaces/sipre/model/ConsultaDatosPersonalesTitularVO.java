package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class ConsultaDatosPersonalesTitularVO extends BaseModel {
    @Getter
    @Setter
    private String nss;

    @Getter
    @Setter
    private String idGrupoFamiliar;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String apellidoPaterno;

    @Getter
    @Setter
    private String apellidoMaterno;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private DatosContactoTitular[] datosDeContacto;
}
