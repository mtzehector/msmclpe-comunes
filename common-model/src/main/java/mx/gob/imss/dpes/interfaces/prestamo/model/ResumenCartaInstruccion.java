/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import net.sf.jasperreports.engine.JRDataSource;

/**
 *
 * @author osiris.hernandez
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class ResumenCartaInstruccion extends BaseModel{
  @XmlElement @Getter @Setter String ciudad;
  @XmlElement @Getter @Setter String fecha;
  @XmlAttribute @Getter @Setter String folio;
  @XmlElement @Getter @Setter String nombre;
  @XmlElement @Getter @Setter String primerApe;
  @XmlElement @Getter @Setter String segundoApe;
  @XmlElement @Getter @Setter String nss;
  @XmlElement @Getter @Setter String curp;
  @XmlElement @Getter @Setter String delegacion;
  @XmlElement @Getter @Setter String delegacionDesc;
  @XmlElement @Getter @Setter String telefono;
  @XmlElement @Getter @Setter String email;
  @XmlElement @Getter @Setter String tipoCredito;
  @XmlElement @Getter @Setter String tipoPension;
  @XmlElement @Getter @Setter String tipoTrabajador;
  @XmlElement @Getter @Setter String nombreComercial;
  @XmlElement @Getter @Setter String razonSocial;
  @XmlElement @Getter @Setter String telefonoBanco;
  @XmlElement @Getter @Setter String webBanco;
  @XmlElement @Getter @Setter String correoElectronico;
  @XmlElement @Getter @Setter String tasaAnual;
  @XmlElement @Getter @Setter String cat;
  @XmlElement @Getter @Setter String montoSolicitado;
  @XmlElement @Getter @Setter String importeDescNomina;
  @XmlElement @Getter @Setter String totalDescAplicar;
  @XmlElement @Getter @Setter String plazo;
  @XmlElement @Getter @Setter String totalCredPagarInt;
  @XmlElement @Getter @Setter String nominaPrimerDesc;
  @XmlElement @Getter @Setter String fechaVigFolio;
  @XmlElement @Getter @Setter String selloDigital;
  @XmlElement @Getter @Setter String codigoQR;
  @XmlElement @Getter @Setter String cadenaOriginal;
  
  @XmlElement @Getter @Setter String folioPL;
  @XmlElement @Getter @Setter String montoSolPL;
  @XmlElement @Getter @Setter String descMensPL;
  @XmlElement @Getter @Setter String montoLiquidarPL;
  @XmlElement @Getter @Setter String plazoPL;
  @XmlElement @Getter @Setter String catPL;
  @XmlElement @Getter @Setter String razonSocialPL;
  
  @XmlElement @Getter @Setter String numEmpleado;
  @XmlElement @Getter @Setter String nombreP;
  @XmlElement @Getter @Setter String primerApellido;
  @XmlElement @Getter @Setter String segundoApellido;
  @XmlElement @Getter @Setter String curpPromotor;
  
  @XmlElement @Getter @Setter String origen;
  @XmlElement @Getter @Setter JRDataSource tablaAmort;
  @XmlElement @Getter @Setter JRDataSource prestamosPorLiquidar;
  
  @XmlElement @Getter @Setter String clabeEF;
  @XmlElement @Getter @Setter String periodoNominaDelPrestamo;
  @XmlElement @Getter @Setter String periodoNominaPosteriorAlPrestamo;
  @XmlElement @Getter @Setter String importeARecibir;
  @XmlElement @Getter @Setter Integer numMesesConsecutivo;
  
}
