/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesEstadisticos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 * 
 */
public class ReportePrestamosAutorizadosDetalleEFResponse {

  @JsonProperty("entidadFinanciera") @Getter @Setter private String entidadFinanciera;
  @JsonProperty("totalAutorizados") @Getter @Setter private Double totalAutorizados;
  @JsonProperty("importePromedio") @Getter @Setter private Double importePromedio;
  @JsonProperty("descuentoPromedio") @Getter @Setter private Double descuentoPromedio;
  @JsonProperty("mesesPromedio") @Getter @Setter private Integer mesesPromedio;
  @JsonProperty("catPromedio") @Getter @Setter private Double catPromedio;
  @JsonProperty("simulacionNuevos") @Getter @Setter private Integer simulacionNuevos;
  @JsonProperty("simulacionRenovacion") @Getter @Setter private Integer simulacionRenovacion;
  @JsonProperty("simulacionCartera") @Getter @Setter private Integer simulacionCartera;
  @JsonProperty("promotorNuevos") @Getter @Setter private Integer promotorNuevos;             
  @JsonProperty("promotorRenovacion") @Getter @Setter private Integer promotorRenovacion;
  @JsonProperty("promotorCartera") @Getter @Setter private Integer promotorCartera;
  @JsonProperty("totalHombres") @Getter @Setter private Integer totalHombres;
  @JsonProperty("totalMujeres") @Getter @Setter private Integer totalMujeres;
  @JsonProperty("edadPromedioHombres") @Getter @Setter private Integer edadPromedioHombres;
  @JsonProperty("edadPromedioMujeres") @Getter @Setter private Integer  edadPromedioMujeres; 

    
}

