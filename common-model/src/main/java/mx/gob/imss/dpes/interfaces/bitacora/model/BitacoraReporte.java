/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.bitacora.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.reportesMclp.model.EstadoReporte;
import mx.gob.imss.dpes.interfaces.reportesMclp.model.SubTipoReporte;
import mx.gob.imss.dpes.interfaces.reportesMclp.model.TipoReporte;

/**
 *
 * @author juan.garfias
 */
public class BitacoraReporte extends BaseModel {

    public BitacoraReporte() {
    }

    public BitacoraReporte(Long id, Long cveReporte, String periodoNomina, TipoReporte tipoReporte, SubTipoReporte subTipoReporte, EstadoReporte estadoReporte, String descripccion, String curpUsuario) {
        this.id = id;
        this.cveReporte = cveReporte;
        this.periodoNomina = periodoNomina;
        this.tipoReporte = tipoReporte;
        this.subTipoReporte = subTipoReporte;
        this.estadoReporte = estadoReporte;
        this.descripccion = descripccion;
        this.curpUsuario = curpUsuario;
    }

    @Getter
    @Setter
    public Long id;

    @Getter
    @Setter
    public Long cveReporte;

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
    public String descripccion;
    @Getter
    @Setter
    public String curpUsuario;
}
