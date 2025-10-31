/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.notificacion.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.Persona;
import mx.gob.imss.dpes.interfaces.solicitud.model.Solicitud;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author edgar.arenas
 */
@Data
public class Prestamo extends BaseModel {

    @Getter
    @Setter
    private String desEstadoPrestamo;
    @Getter
    @Setter
    private String desTipoCredito;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaAlta;
    @Getter
    @Setter
    private String numSolicitud;
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String nss;
    @Getter
    @Setter
    private String curp;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaVencimiento;
    @Getter
    @Setter
    private String cat;
    @Getter
    @Setter
    private String desPlazo;
    @Getter
    @Setter
    private Persona pensionado;
    @Getter
    @Setter
    private Long cveSolicitud;
    @Getter
    @Setter
    private Solicitud solicitud;
    @Getter
    @Setter
    private BigDecimal impMontoSol;
    @Getter
    @Setter
    private BigDecimal impDescuentoNomina;
    @Getter
    @Setter
    private BigDecimal impTotalPagar;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fecPrimerDescuento;
    @Getter
    @Setter
    private Integer numPeriodoNomina;
    @Getter
    @Setter
    private String refCuentaClabe;
    @Getter
    @Setter
    private CondicionOferta cveCondicionOferta;
    @Getter
    @Setter
    private TipoCredito cveTipoCredito;
    @Getter
    @Setter
    private TipoSimulacion cveTipoSimulacion;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class TipoCredito {

        @Getter
        @Setter
        private Long id;
        @Getter
        @Setter
        private String desTipoCredito;

        public TipoCredito() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class TipoSimulacion {

        @Getter
        @Setter
        private Long id;
        @Getter
        @Setter
        private String desTipoSimulacion;

        public TipoSimulacion() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class CondicionOferta {

        @Getter
        @Setter
        private Long id;
        @Getter
        @Setter
        private Long cveEntidadFinanciera;
        @Getter
        @Setter
        private Long porTasaAnual;
        @Getter
        @Setter
        private Long porCat;
        @Getter
        @Setter
        private Plazo cvePlazo;

        public CondicionOferta() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Plazo {

        @Getter
        @Setter
        private Long id;
        @Getter
        @Setter
        private String desPlazo;
        @Getter
        @Setter
        private Long numMeses;

        public Plazo() {
        }
    }

}
