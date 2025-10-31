package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoEFPS extends BaseModel {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long idPrestadorServicios;

    @Getter
    @Setter
    private Long idDocumento;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private DocumentoEFPSDocumento documento;
}
