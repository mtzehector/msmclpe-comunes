/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class Conciliacion extends BaseModel {

    @Getter
    @Setter
    private String id_EF;
    @Getter
    @Setter
    private String razonSocial_EF;
    @Getter
    @Setter
    private Long noProv_EF;
    @Getter
    @Setter
    private String producto_EF;
    @Getter
    @Setter
    private Integer descYRepoEmit_casos = 0;
    @Getter
    @Setter
    private Double descYRepoEmit_importe = 0d;
    @Getter
    @Setter
    private Integer descYRepoPagados_casos = 0;
    @Getter
    @Setter
    private Double descYRepoPagados_importe = 0d;
    @Getter
    @Setter
    private Integer noPagado_casos = 0;
    @Getter
    @Setter
    private Double noPagado_importe = 0d;
    @Getter
    @Setter
    private Double totalRetenciones = 0d;
    @Getter
    @Setter
    private Double costoAdmin_i = 0d;
    @Getter
    @Setter
    private Double costoAdmin_iva = 0d;
    @Getter
    @Setter
    private Double netoSinDescFallecidos_importe = 0d;
    @Getter
    @Setter
    private Integer fallecidos_casos = 0;
    @Getter
    @Setter
    private Double fallecidos_importe = 0d;
    @Getter
    @Setter
    private Double pagoReal = 0d;
    @Getter
    @Setter
    private Integer inconsistencias_casos = 0;
    @Getter
    @Setter
    private Double inconsistencias_importe = 0d;
    @Getter
    @Setter
    private String id_EF_SIPRE;
}
