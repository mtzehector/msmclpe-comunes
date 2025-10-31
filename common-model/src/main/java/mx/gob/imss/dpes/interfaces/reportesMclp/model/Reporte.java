/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesMclp.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.BitacoraReporte;

/**
 *
 * @author juan.garfias
 */
public class Reporte extends BaseModel {

    @Getter
    @Setter
    public Long id;
    @Getter
    @Setter
    public String periodoNomina;
    @Getter
    @Setter
    public TipoReporte tipoReporte;
    @Getter
    @Setter
    public SubTipoReporte subTipoReporte;
    @Getter
    @Setter
    public EstadoReporte estadoReporte;
    @Getter
    @Setter
    public String curpUsuario;

    @Getter
    @Setter
    private BitacoraReporte bitacoraReporte;
    
    @Getter
    @Setter
    private Long cveEntidadFinanciera;
}
