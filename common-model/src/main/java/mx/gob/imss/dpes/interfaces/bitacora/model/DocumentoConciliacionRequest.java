package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.EntidadFinanciera;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.util.Date;

public class DocumentoConciliacionRequest extends BaseModel {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long cveDocumento;

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private String periodo;

    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaDescarga;

    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaAlta;

    @Getter
    @Setter
    private Boolean erogacion;

    @Getter
    @Setter
    private Documento documento;

    @Getter
    @Setter
    private EntidadFinanciera entidadFinanciera;

}
