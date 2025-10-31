/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesMclp.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class TipoReporte  extends BaseModel {

    public TipoReporte() {
    }

    public TipoReporte(Long id) {
        this.id = id;
    }
    
    @Getter @Setter    
    public Long id;
    @Getter @Setter
    public String desTipoReporte;
    
}
