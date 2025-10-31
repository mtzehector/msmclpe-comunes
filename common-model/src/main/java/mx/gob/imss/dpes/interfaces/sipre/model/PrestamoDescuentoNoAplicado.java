package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class PrestamoDescuentoNoAplicado extends BaseModel {

    @Getter
    @Setter
    private String folio;

    @Getter
    @Setter
    private String folioSipre;

    @Getter
    @Setter
    private String nss;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private String grupoFamiliar;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String primerApellido;

    @Getter
    @Setter
    private String segundoApellido;

    @Getter
    @Setter
    private String correoElectronico;

    @Getter
    @Setter
    private String telefonoLocal;

    @Getter
    @Setter
    private String telefonoCelular;

    @Getter
    @Setter
    private String delegacion;

    @Getter
    @Setter
    private BigDecimal fechaInicio;

    @Getter
    @Setter
    private String entidadFInanciera;

    @Getter
    @Setter
    private BigDecimal cat;

    @Getter
    @Setter
    private BigDecimal montoSolicitado;

    @Getter
    @Setter
    private BigDecimal descuentoMensual;

    @Getter
    @Setter
    private Integer plazo;

    @Getter
    @Setter
    private BigDecimal importeTotalPagar;

    @Getter
    @Setter
    private Integer numMesesSinRecuperacion;

    @Getter
    @Setter
    private String entidadFinancieraSIPRE;

    @Getter
    @Setter
    private BigDecimal saldoCapital;

	@Getter
    @Setter
    private Date fechaPrimerDescuento;

    @Getter
    @Setter
    private Integer numMesesConsecutivos;

    @Getter
    @Setter
    private BigDecimal pension;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoDescuentoNoAplicado that = (PrestamoDescuentoNoAplicado) o;
        return Objects.equals(folioSipre, that.folioSipre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folioSipre);
    }
}
