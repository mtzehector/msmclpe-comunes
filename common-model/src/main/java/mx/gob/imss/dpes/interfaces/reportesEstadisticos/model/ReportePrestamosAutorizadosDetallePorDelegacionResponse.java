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
 */
public class ReportePrestamosAutorizadosDetallePorDelegacionResponse {
  @JsonProperty("delegacion") @Getter @Setter private String delegacion;
  @JsonProperty("subDelegacion") @Getter @Setter private String subDelegacion;
  @JsonProperty("totalRecuperacion") @Getter @Setter private Integer totalRecuperacion;
  @JsonProperty("totalCreditos") @Getter @Setter private Integer totalCreditos;
  @JsonProperty("totalLiquidados") @Getter @Setter private Integer totalLiquidados;
  @JsonProperty("liquidadosCartera") @Getter @Setter private Integer liquidadosCartera;
  @JsonProperty("liquidadosRenovados") @Getter @Setter private Integer liquidadosRenovados;
  @JsonProperty("liquidadosEnPlazo") @Getter @Setter private Integer liquidadosEnPlazo;
  @JsonProperty("bajasPorEF") @Getter @Setter private Integer bajasPorEF;
  @JsonProperty("bajasPorDefuncion") @Getter @Setter private Integer bajasPorDefuncion;             
  @JsonProperty("subtotalCredito") @Getter @Setter private Integer subtotalCredito;
    
}
