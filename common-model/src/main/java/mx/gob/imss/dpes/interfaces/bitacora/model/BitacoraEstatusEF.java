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
public class BitacoraEstatusEF extends BaseModel {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long idEntidadFinanciera;

    @Getter
    @Setter
    private Long idTipoEvento;

    @Getter
    @Setter
    private Integer idEstadoEFAnterior;

    @Getter
    @Setter
    private Integer idEstadoEFNuevo;

    @Getter
    @Setter
    private String curp;
}
