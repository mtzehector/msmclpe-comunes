/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class ReporteConciliacion extends BaseModel {

    @Getter
    @Setter
    private List<Conciliacion> lstConciliaciones;

    @Getter
    @Setter
    private Integer total_descYRepoEmit_casos;
    @Getter
    @Setter
    private Double total_descYRepoEmit_importe;
    @Getter
    @Setter
    private Integer total_descYRepoPagados_casos;
    @Getter
    @Setter
    private Double total_descYRepoPagados_importe;
    @Getter
    @Setter
    private Integer total_noPagado_casos;
    @Getter
    @Setter
    private Double total_noPagado_importe;
    @Getter
    @Setter
    private Double total_totalRetenciones;
    @Getter
    @Setter
    private Double total_costoAdmin_i;
    @Getter
    @Setter
    private Double total_costoAdmin_iva;
    @Getter
    @Setter
    private Double total_netoSinDescFallecidos_importe;
    @Getter
    @Setter
    private Integer total_fallecidos_casos;
    @Getter
    @Setter
    private Double total_fallecidos_importe;
    @Getter
    @Setter
    private Double total_pagoReal;
    @Getter
    @Setter
    private Integer total_inconsistencias_casos;
    @Getter
    @Setter
    private Double total_inconsistencias_importe;
    @Getter
    @Setter
    private String archivoXLSXBase64;
    @Getter
    @Setter
    private List<Inconsistencia> inconsistenciasList;
    @Getter
    @Setter
    private String archivoTxtBase64;
}
