/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class Inconsistencia extends BaseModel{
    
    private String folioPrestamo;
    private String cveEntidadFinanciera;
    private String nss;
    private String grupoFamiliar;
    private Double importeRecuperado;
    private String idMovimiento;
}
