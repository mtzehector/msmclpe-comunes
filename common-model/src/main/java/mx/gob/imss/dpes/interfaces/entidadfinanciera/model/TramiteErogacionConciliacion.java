package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;

import java.util.Date;
import java.util.Objects;

public class TramiteErogacionConciliacion extends BaseModel {

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private String nombreComercial;

    @Getter
    @Setter
    private Long cveCartaRecibo;

    @Getter
    @Setter
    private Integer cveTipoDocumentoCartaRecibo;

    @Getter
    @Setter
    private Date fechaDescargaCartaRecibo;

    @Getter
    @Setter
    private Date fechaFirmaCartaRecibo;

    @Getter
    @Setter
    private Boolean erogacion;

    @Getter
    @Setter
    private Documento transferencia;

    @Getter
    @Setter
    private Documento cuentaContable;

    @Getter
    @Setter
    private Documento delegacion;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TramiteErogacionConciliacion that = (TramiteErogacionConciliacion) o;
        return Objects.equals(cveEntidadFinanciera, that.cveEntidadFinanciera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveEntidadFinanciera);
    }
}
