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
public class ReporteDescuentoEmitidoRow  extends BaseModel {
    @Getter        
    @Setter
    Integer descEmit_casos;
    
    @Getter        
    @Setter
    Double descEmit_importe;
    
    @Getter        
    @Setter
    Integer reposEmit_casos;
    
    @Getter        
    @Setter
    Double reposEmit_importe;
    
    @Getter        
    @Setter
    Integer incons_casos;
    
    @Getter        
    @Setter
    Double incons_importe;

    public ReporteDescuentoEmitidoRow(Integer descEmit_casos, Double descEmit_importe, Integer reposEmit_casos, Double reposEmit_importe, Integer incons_casos, Double incons_importe) {
        this.descEmit_casos = descEmit_casos;
        this.descEmit_importe = descEmit_importe;
        this.reposEmit_casos = reposEmit_casos;
        this.reposEmit_importe = reposEmit_importe;
        this.incons_casos = incons_casos;
        this.incons_importe = incons_importe;
    }

    public ReporteDescuentoEmitidoRow() {
    }
    
    
    
}
