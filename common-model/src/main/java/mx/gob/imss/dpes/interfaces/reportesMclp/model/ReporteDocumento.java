/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesMclp.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;

/**
 *
 * @author juan.garfias
 */
public class ReporteDocumento extends BaseModel {
        
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private Long cveReporte;
    @Getter @Setter
    private Documento documento;
}
