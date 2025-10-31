package mx.gob.imss.dpes.interfaces.sipre.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.gob.imss.dpes.interfaces.sistrap.model.SistrapResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaEstatusResponse extends SistrapResponse {
    @Getter
    @Setter
    private ConsultaStatusPrestamo consultaStatusPrestamo;
}
