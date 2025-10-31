package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.util.Date;

@Data
public class BitacoraPensionadoRequest extends BaseModel {

    private Long id;

    private String cveCurp;

    private Long cvePersona;

    private String valorAnterior;

    private String valorActual;

    private TipoModificacionRequest tipoModificacion;

    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fecRegistro;

    @Override
    public String toString() {
        return "BitacoraPensionadoRequest{" +
                "id=" + id +
                ", cveCurp='" + cveCurp + '\'' +
                ", cvePersona=" + cvePersona +
                ", valorAnterior='" + valorAnterior + '\'' +
                ", valorActual='" + valorActual + '\'' +
                ", tipoModificacion=" + tipoModificacion +
                ", fecRegistro=" + fecRegistro +
                '}';
    }
}
