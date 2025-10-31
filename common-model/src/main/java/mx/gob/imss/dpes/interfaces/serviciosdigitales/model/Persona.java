/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.bdtu.Sexo;
/**
 *
 * @author antonio
 */
public class Persona extends BaseModel {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Long cveIdPersona;
    @Getter
    @Setter
    private String curp;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String primerApellido;
    @Getter
    @Setter
    private String segundoApellido;
    @Getter
    @Setter
    private String correoElectronico;
    @Getter
    @Setter
    private String telefono;
    @Getter
    @Setter
    private String nss;
    @Getter
    @Setter
    private String fechaNacimiento;
   
    @Getter
    @Setter
    private Sexo sexo;

}
