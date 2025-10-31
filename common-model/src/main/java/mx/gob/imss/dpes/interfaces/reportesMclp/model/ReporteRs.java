/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesMclp.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class ReporteRs extends BaseModel {
    
    @Getter @Setter Reporte reporte;
    @Getter @Setter List<ReporteDocumento> reporteDocumentos;
    @Getter @Setter List<Correo> correos;

    public ReporteRs() {
    }

    public ReporteRs(Reporte reporte, List<ReporteDocumento> reporteDocumentos) {
        this.reporte = reporte;
        this.reporteDocumentos = reporteDocumentos;
    }
    
}
