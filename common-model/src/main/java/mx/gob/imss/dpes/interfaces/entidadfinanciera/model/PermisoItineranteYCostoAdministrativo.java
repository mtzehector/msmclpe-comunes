package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;
import java.util.Objects;

public class PermisoItineranteYCostoAdministrativo extends BaseModel {

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private String nombreComercial;

    @Getter
    @Setter
    private Integer numeroProveedor;

    @Getter
    @Setter
    private Integer cveConvenioAdminFinanciera;

    @Getter
    @Setter
    private Double porcentajeAdministracion;

    @Getter
    @Setter
    private Double porcentajePermisoItinerante;

    @Getter
    @Setter
    private String periodoInicioVigencia;

    @Getter
    @Setter
    private String periodoFinVigencia;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermisoItineranteYCostoAdministrativo that = (PermisoItineranteYCostoAdministrativo) o;
        return Objects.equals(cveEntidadFinanciera, that.cveEntidadFinanciera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveEntidadFinanciera);
    }
}
