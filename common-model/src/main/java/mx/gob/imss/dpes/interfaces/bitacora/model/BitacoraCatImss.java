package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.BitacoraEnum;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class BitacoraCatImss extends BaseModel {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    Long idTipoEvento;

    @Getter
    @Setter
    String desTipoEvento;

    @Getter
    @Setter
    private Long cveDocumento;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private BigDecimal cat;

    @Getter
    @Setter
    private BitacoraCatImssDocumento documento;
}
