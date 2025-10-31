package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.util.Date;

public class PrestadorServiciosEF extends BaseModel  {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private Integer cveTipoPrestadorServicios;

    @Getter
    @Setter
    private String registroPatronal;

    @Getter
    @Setter
    private String rfc;

    @Getter
    @Setter
    private String razonSocial;

    @Getter
    @Setter
    private String direccion;

    @Getter
    @Setter
    private String correoElectronico;

    @Getter
    @Setter
    private String paginaWeb;

    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date bajaRegistro;
}
