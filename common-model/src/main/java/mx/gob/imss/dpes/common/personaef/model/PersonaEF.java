/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.personaef.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoPersonaEFEnum;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.Persona;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.EntidadFinanciera;

/**
 *
 * @author osiris.hernandez
 */
public class PersonaEF extends Persona {

    @Getter
    @Setter
    private Long idPersonaEF;
    @Getter
    @Setter
    private String numEmpleado;
    @Getter
    @Setter
    private String nss;
    @Getter
    @Setter
    private Long cveEntidadFinanciera;
    @Getter
    @Setter
    private EntidadFinanciera entidadFinanciera;
    @Getter
    @Setter
    private TipoPersonaEFEnum tipoPersonaEF;
    @Getter
    @Setter
    private String cveCurp;
    @Getter
    @Setter
    private String cveDelegacion;
    @Getter
    @Setter
    private Long cveEstadoPersonaEf;
    @Getter
    @Setter
    private Long cveTipoPersonaEf;
    @Getter
    @Setter
    private Integer indRegistrado;

}
