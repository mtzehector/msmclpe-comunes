package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.TipoDocumentoFront;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class BitacoraCatImssDocumento extends BaseModel {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private TipoDocumentoFront tipoDocumentoEnum;

    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date altaRegistro;
}
