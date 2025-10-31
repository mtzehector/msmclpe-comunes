package mx.gob.imss.dpes.interfaces.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;

public class PrestamoInsumoTa extends BaseModel {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Integer historico;
    @Getter
    @Setter
    private Long cveSolicitud;
    @Getter
    @Setter
    private Integer plazo;
    @Getter
    @Setter
    private BigDecimal cat;
    @Getter
    @Setter
    private BigDecimal monto;
    @Getter
    @Setter
    private BigDecimal totalPagar;
    @Getter
    @Setter
    private Integer cveTipoSimulacion;
    @Getter
    @Setter
    private String folioSipre;
    @Getter
    @Setter
    private BigDecimal descuentoMensual;

}
