package mx.gob.imss.dpes.interfaces.sipre.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaEstatusReinstalacion extends BaseModel {
    @Getter
    @Setter
    private ConsultaEstatusRequest request;

    @Getter
    @Setter
    private ConsultaEstatusResponse response;
}
