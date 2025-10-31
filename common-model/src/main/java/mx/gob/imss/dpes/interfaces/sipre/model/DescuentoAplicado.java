/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
/**   
 * @author antonio
 */
public class DescuentoAplicado extends BaseModel{
  @Getter @Setter private String nss;
  @Getter @Setter private String idInstFinanciera;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private String razonSocial;
  @Getter @Setter private String movimiento;  
  @Getter @Setter private Double impRecuperado; 
  @Getter @Setter private String idSolPrestFinanciero;  
  @Getter @Setter private String conceptoNomina;
  @Getter @Setter private String peridoNomina;  
  private String periodoNomina;   
  @Getter @Setter private Double saldoPendiente; 
  @Getter @Setter private String desMovimiento;  
  
  public String getPeriodoNomina(){
      return this.peridoNomina;
  }

  
}
