package mx.gob.imss.dpes.interfaces.solicitud.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;

public class Conciliacion extends BaseModel {

    @Getter
    @Setter
    private String NSS;

    @Getter
    @Setter
    private String GRUPOFAMILIAR;

    @Getter
    @Setter
    private String CVEDELEGACION;

    @Getter
    @Setter
    private String NUMEROFOLIO;

    @Getter
    @Setter
    private BigDecimal TOTALPAGAR;

    @Getter
    @Setter
    private BigDecimal SALDOPENDIENTE;

    @Getter
    @Setter
    private BigDecimal DESCUENTONOMINA;

    @Getter
    @Setter
    private BigDecimal PLAZO;

    @Getter
    @Setter
    private BigDecimal NUMEROMENSUALIDAD;

    @Getter
    @Setter
    private BigDecimal CONCEPTO;

    @Getter
    @Setter
    private BigDecimal IMPORTERECUPERADO;

    @Getter
    @Setter
    private String CVERECHAZOSPES;

}
