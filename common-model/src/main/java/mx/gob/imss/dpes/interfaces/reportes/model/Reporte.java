/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.BitacoraInterfaz;
import mx.gob.imss.dpes.interfaces.bitacora.model.BitacoraReporte;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;
import mx.gob.imss.dpes.interfaces.reportesMclp.model.ReporteRs;
import mx.gob.imss.dpes.interfaces.sipre.model.ConsultaDescuentoEmitidoResponse;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author edgar.arenas
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reporte extends BaseModel {

    @Getter
    @Setter
    private Long tipoReporte;
    @Getter
    @Setter
    private String anioNominal;
    @Getter
    @Setter
    private String mesNominal;
    @Getter
    @Setter
    private String curpUsuario;
    @Getter
    @Setter
    private ConsultaDescuentoEmitidoResponse descuentosResponse;
    @Getter
    @Setter
    private ReporteConciliacion reporteConciliacion;
    @Getter
    @Setter
    private Boveda boveda;
    @Getter
    @Setter
    private Documento docConciliacion;
    @Getter
    @Setter
    private Documento docInconsistencias;
    @Getter
    @Setter
    private Integer flagReporte;
    @Getter
    @Setter
    private Boolean flagGenerarReporte;
    @Getter
    @Setter
    private ReporteConciliacionEF reporteConciliacionEF;
    @Getter
    @Setter
    private BitacoraReporte bitacoraReporte;

    @Getter
    @Setter
    private ReporteRs ReporteRs;

    @Getter
    @Setter
    private BitacoraInterfaz bitacoraInterfaz;

    @Getter
    @Setter
    private ReporteDescuentosEmitidos repDesctsEmitds;

    @Getter
    @Setter
    private Documento docDescEmitByDel;
    @Getter
    @Setter
    private Documento docDescEmitByEF;

    @Getter
    @Setter
    private Documento docInconsPrestamos;
    @Getter
    @Setter
    private Documento docInconsDescuentos;
    @Getter
    @Setter
    private ReporteCompraCarteraEF reporteCompraCarteraEF;
    @Getter
    @Setter
    private Documento docComprasDeCarteraEF;
    @Getter
    @Setter
    private String cveEntidadFinanciera;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaDesde;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaHasta;
    @Getter
    @Setter
    private ReportePrestamosAutorizadosPorEF reportePrestamosAutorizadosPorEF;

    @Getter
    @Setter
    private String archivoXLSX;

    @Getter
    @Setter
    private ReportePrestamosAutorizadosDetallePorEF reportePrestamosAutorizadosDetallePorEF;

    @Getter
    @Setter
    private ReportePrestamosAutorizadosDetalleDelegacion reportePrestamosAutorizadosDetalleDelegacion;

    @Getter
    @Setter
    private Long sesion;

}
