
package mx.gob.imss.dpes.interfaces.sipre.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;


public class RegistroPrestamoRequest extends BaseModel  {
  @Getter @Setter private String numFolio;
  @Getter @Setter private String numProveedor;
  //@Getter @Setter private String idInstFinanciera;
  @Getter @Setter private String nss;
  @Getter @Setter private String grupoFamiliar;
  @Getter @Setter private String curp;
  @Getter @Setter private String nombre;
  @Getter @Setter private String apellidoPaterno;
  @Getter @Setter private String apellidoMaterno;
  @Getter @Setter private String clabe;
  @Getter @Setter private Double impPrestamo;
  @Getter @Setter private String numPlazo;
  @Getter @Setter private String fecAlta;
  @Getter @Setter private Double impMensual;
  @Getter @Setter private String nominaPrimerDescuento;
  @Getter @Setter private Double catPrestamo;
  @Getter @Setter private Double impRealPrestamo;
  @Getter @Setter private String imgCartaInstruccion;
  @Getter @Setter private String tipoMovimiento;
  @Getter @Setter private String idSolPrestLiq1;
  @Getter @Setter private String idSolPrestLiq2;
  @Getter @Setter private String idSolPrestLiq3;
  @Getter @Setter private String fecInicioPrestamo;
  @Getter @Setter private String numContrato;
  
}
