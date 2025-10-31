/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reporteCompraCartera.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 */
public class ReporteCompraCartera {
        
 
    @JsonProperty("nombreComercial") @Getter @Setter private   String NOMBRE_COMERCIAL;
  @JsonProperty("numeroDeProveedor") @Getter @Setter private BigDecimal NUMERO_DE_PROVEEDOR;
  @JsonProperty("emision") @Getter @Setter private Date EMISION;
  @JsonProperty("folio") @Getter @Setter private String FOLIO;
  @JsonProperty("nss") @Getter @Setter private String NSS;
  @JsonProperty("curp") @Getter @Setter private String CURP;
  @JsonProperty("nombreCompleto") @Getter @Setter private String NOMBRE_COMPLETO;
  @JsonProperty("importe") @Getter @Setter private BigDecimal IMPORTE;
  @JsonProperty("descuento") @Getter @Setter private BigDecimal DESCUENTO;
  @JsonProperty("numDescuento") @Getter @Setter private BigDecimal NUM_DESCUENTO;
  @JsonProperty("importeLiquidado") @Getter @Setter private BigDecimal IMPORTE_LIQUIDADO;
  @JsonProperty("cat") @Getter @Setter private BigDecimal CAT;

}
