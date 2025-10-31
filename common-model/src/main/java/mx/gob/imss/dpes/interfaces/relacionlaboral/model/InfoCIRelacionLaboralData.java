/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.relacionlaboral.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author eduardo.loyo
 */
public class InfoCIRelacionLaboralData {
    @Getter @Setter private String modalidad;
    @Getter @Setter private String tipoMovimiento;
    @Getter @Setter private String regPatron;
    @Getter @Setter private String fecIniRelLab;
    @Getter @Setter private String fecFinRelLab;
}
