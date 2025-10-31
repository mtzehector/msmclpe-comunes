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
public class Prestamo extends BaseModel{  
  @Getter @Setter private String curp;
  @Getter @Setter private String idNss;
  @Getter @Setter private String idGrupoFamiliar;
  @Getter @Setter private String numFolio;
  @Getter @Setter private String idInstFinanciera;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private String nombre;
  @Getter @Setter private String apellidoPaterno;
  @Getter @Setter private String apellidoMaterno;
  @Getter @Setter private Double impPrestamo;
  @Getter @Setter private Double impRealPrestamo;
  @Getter @Setter private String telefonoTitular;
  @Getter @Setter private String email;
  @Getter @Setter private String tipoTrabajador;
  @Getter @Setter private String tipoCredito;
  @Getter @Setter private String tipoPension;
  @Getter @Setter private String nomFinanciera;
  @Getter @Setter private String razonSocial;
  @Getter @Setter private String telefonoFinanciera;
  @Getter @Setter private String desUrlFinanciera;
  @Getter @Setter private Double catPromedio;
  @Getter @Setter private Double impDescuentoMensual;
  @Getter @Setter private Double numTasaIntAnual;
  @Getter @Setter private Double impPrestamoOtor;
  @Getter @Setter private String numVecesAplicar;
  @Getter @Setter private Double numPlazoMeses;
  @Getter @Setter private String fecInicioPago;
  @Getter @Setter private String idSolPrFinanciero;
  @Getter @Setter private String movimiento;
  @Getter @Setter private Integer registrosCargados;
}
