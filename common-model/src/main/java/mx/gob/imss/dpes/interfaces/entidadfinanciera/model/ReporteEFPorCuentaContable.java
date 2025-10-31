package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.util.Objects;

public class ReporteEFPorCuentaContable extends BaseModel {

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private Integer numeroProveedor;

    @Getter
    @Setter
    private String razonSocial;

    @Getter
    @Setter
    private String nombreComercial;

    @Getter
    @Setter
    private Double retencionNacional;

    @Getter
    @Setter
    private Double costoAdministrativo;

    @Getter
    @Setter
    private Double ivaCostoAdministrativo;

    @Getter
    @Setter
    private Double permisoItinerante;

    @Getter
    @Setter
    private Double ivaPermisoItinerante;

    @Getter
    @Setter
    private Double importeFallecidos;

    @Getter
    @Setter
    private Double netoPagar;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReporteEFPorCuentaContable that = (ReporteEFPorCuentaContable) o;
        return Objects.equals(cveEntidadFinanciera, that.cveEntidadFinanciera) && Objects.equals(numeroProveedor, that.numeroProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveEntidadFinanciera, numeroProveedor);
    }
}
