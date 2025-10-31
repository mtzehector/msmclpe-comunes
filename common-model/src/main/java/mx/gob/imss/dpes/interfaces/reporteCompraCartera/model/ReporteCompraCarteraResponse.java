/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reporteCompraCartera.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 */
public class ReporteCompraCarteraResponse {
  @JsonProperty("nombreComercial") @Getter @Setter private   String nombreComercial;
  @JsonProperty("numeroDeProveedor") @Getter @Setter private String numeroDeProveedor;
  @JsonProperty("emision") @Getter @Setter private Date emision;
  @JsonProperty("folio") @Getter @Setter private String folio;
  @JsonProperty("nss") @Getter @Setter private String nss;
  @JsonProperty("curp") @Getter @Setter private String curp;
  @JsonProperty("nombreCompleto") @Getter @Setter private String nombreCompleto;
  @JsonProperty("importe") @Getter @Setter private Double importe;
  @JsonProperty("descuento") @Getter @Setter private Double descuento;
  @JsonProperty("numDescuento") @Getter @Setter private Integer numDescuento;
  @JsonProperty("importeLiquidado") @Getter @Setter private Double importeLiquidado;
  @JsonProperty("cat") @Getter @Setter private Double cat;

    
}
