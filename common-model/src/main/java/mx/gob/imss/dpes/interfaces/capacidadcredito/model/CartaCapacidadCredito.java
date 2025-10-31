/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.capacidadcredito.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
/**
 *
 * @author antonio
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class CartaCapacidadCredito extends BaseModel{
  @Getter @Setter private String ciudad;
  @Getter @Setter private String fecha;
  @Getter @Setter private String folio;
  @Getter @Setter private String curp;
  @Getter @Setter private String nss;
  @Getter @Setter private String nombre;
  @Getter @Setter private String primerApe;
  @Getter @Setter private String segundoApe;
  @Getter @Setter private String telefono;
  @Getter @Setter private String email;
  @Getter @Setter private String delegacion;
  @Getter @Setter private String tipoCredito;
  @Getter @Setter private String tipoPension;
  @Getter @Setter private String tipoTrabajador;
  @Getter @Setter private String impCapacidadFija;
  @Getter @Setter private String impCapacidadVariable;
  @Getter @Setter private String impCapacidadTotal;
  @Getter @Setter private String selloDigital;
  @Getter @Setter private String codigoQR;
  @Getter @Setter private String cadenaOriginal;
}
