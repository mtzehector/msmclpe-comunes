/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
/**
 *
 * @author antonio
 */
public class PrestamoEnCurso extends BaseModel{  
  @Getter @Setter private String nss;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private Double impPrestamo;
  @Getter @Setter private Integer numVecesAplicar;
  @Getter @Setter private String movimiento;
  @Getter @Setter private String delegacion;
  @Getter @Setter private String idPago;
  @Getter @Setter private Double impRecuperado;
  @Getter @Setter private String insFinanciera;
  @Getter @Setter private Double idSolPrestamo;
}
