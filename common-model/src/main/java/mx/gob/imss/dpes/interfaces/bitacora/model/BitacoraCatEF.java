package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class BitacoraCatEF extends BaseModel {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long idCondicionOferta;

    @Getter
    @Setter
    private Long idTipoEvento;

    @Getter
    @Setter
    private String descripcionTipoEvento;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private Long idPlazoAnterior;

    @Getter
    @Setter
    private String descripcionPlazoAnterior;

    @Getter
    @Setter
    private Long idPlazoNuevo;

    @Getter
    @Setter
    private String descripcionPlazoNuevo;

    @Getter
    @Setter
    private BigDecimal catAnterior;

    @Getter
    @Setter
    private BigDecimal catNuevo;

    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date altaRegistro;

}
