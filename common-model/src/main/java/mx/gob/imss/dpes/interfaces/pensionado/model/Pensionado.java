package mx.gob.imss.dpes.interfaces.pensionado.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.Delegacion;
import mx.gob.imss.dpes.common.model.EntidadFederativa;
import mx.gob.imss.dpes.common.model.UserProfile;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class Pensionado extends UserProfile{
  @Getter @Setter String nss;
  @Getter @Setter String grupoFamiliar;
  @Getter @Setter String curp;
  @Getter @Setter Delegacion delegacion = new Delegacion();
  @Getter @Setter String subDelegacion;
  @Getter @Setter EntidadFederativa entidadFederativa = new EntidadFederativa();
  @Getter @Setter String cuentaClabe;
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class) @Getter @Setter Date fechaNacimiento;
  @Getter @Setter String tipoPension;
  @Getter @Setter String telefonoCelular;
  @Getter @Setter private BigDecimal pension;
  @Getter @Setter private BigDecimal pensionGarantizada;
}
