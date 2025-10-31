package mx.gob.imss.dpes.interfaces.prestamo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import net.sf.jasperreports.engine.JRDataSource;

/**
 *
 * @author antonio
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class ResumenSimulacion extends BaseModel {

  @Getter @Setter String ciudad;
  @Getter @Setter String fecha;
  @Getter @Setter String folio;
  @Getter @Setter String nombre;
  @Getter @Setter String primerApe;
  @Getter @Setter String segundoApe;
  @Getter @Setter String nss;
  @Getter @Setter String curp;
  @Getter @Setter String delegacion;
  @Getter @Setter String delegacionDesc;
  @Getter @Setter String telefono;
  @Getter @Setter String email;
  @Getter @Setter String tipoCredito;
  @Getter @Setter String tipoPension;
  @Getter @Setter String tipoTrabajador;
  @Getter @Setter String nombreComercial;
  @Getter @Setter String razonSocial;
  @Getter @Setter String telefonoBanco;
  @Getter @Setter String webBanco;
  @Getter @Setter String tasaAnual;
  @Getter @Setter String cat;
  @Getter @Setter String montoSolicitado;
  @Getter @Setter String importeDescNomina;
  @Getter @Setter String totalDescAplicar;
  @Getter @Setter String plazo;
  @Getter @Setter String totalCredPagarInt;
  @Getter @Setter String nominaPrimerDesc;
  @Getter @Setter String fechaVigFolio;
  @Getter @Setter String selloDigital;
  @Getter @Setter String codigoQR;
  @Getter @Setter String cadenaOriginal;
  @Getter @Setter JRDataSource tablaAmort;
  @Getter @Setter JRDataSource prestamosPorLiquidar;
  @Getter @Setter String periodoNominaDelPrestamo;
  @Getter @Setter String periodoNominaPosteriorAlPrestamo;
}
