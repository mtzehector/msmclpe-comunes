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
public class ReporteRq extends BaseModel {

    @Getter @Setter
    public List<ReporteDocumento> reporteDocumentos;
    @Getter @Setter
    public Reporte reporte;
    
}
