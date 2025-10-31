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
public class CompraCarteraEFRQ extends BaseModel {
  
    @Getter @Setter
    String periodoNomina;
    @Getter @Setter
    String cveEntidadFinanciera;
    
}
