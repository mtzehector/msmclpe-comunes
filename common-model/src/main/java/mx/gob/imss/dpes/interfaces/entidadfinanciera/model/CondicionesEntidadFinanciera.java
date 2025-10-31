/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class CondicionesEntidadFinanciera extends BaseModel {
    
    private Integer edadLimite;
    private Double MontoMinimo;
    private Double MontoMaximo;
    private Integer cveSexo;
    private Long cveDelegacion;
    private Long cveEntidadFinanciera;
}
