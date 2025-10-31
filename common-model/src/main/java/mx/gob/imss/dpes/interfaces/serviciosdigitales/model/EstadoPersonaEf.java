/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author eduardo.loyo
 */
@Data
public class EstadoPersonaEf extends BaseModel{
    private Long id;
    private String desEstadoPersonaEf;
    
    public EstadoPersonaEf(Long id){
        this.id = id;
    }
    
    public EstadoPersonaEf(){
       
    }
}
