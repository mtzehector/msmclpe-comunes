/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import lombok.Data;


/**
 *
 * @author antonio
 */
@Data
public class TitularGrupo extends BaseModel{
  private String nss;
  private String grupoFamiliar;
  private String curp;
  private String rfc;
  private String fechaNacimiento;
  private String tipoValidacion;
  private String numClabe; 
  private String tipoCuentaPago;
  private String ctaPago;
  private EntidadFederativa entidadFederativa;
  private Delegacion delegacion;
 
  private String subDelegacion;
  private Integer sexo;
}
