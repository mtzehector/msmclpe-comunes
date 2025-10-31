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
public class ReporteMonitorPensionadosResponse {
    
  @JsonProperty("delegacion") @Getter @Setter private String delegacion;
  @JsonProperty("subDelegacion") @Getter @Setter private String subDelegacion;
  @JsonProperty("totalSimulaciones") @Getter @Setter private Integer totalSimulaciones;
  @JsonProperty("totalPrestamoPromotor") @Getter @Setter private Integer totalPrestamoPromotor;
  @JsonProperty("simulacionesVigentes") @Getter @Setter private Integer simulacionesVigentes;
  @JsonProperty("simulacionesCanceladas") @Getter @Setter private Integer simulacionesCanceladas;
  @JsonProperty("tiempoPromedioHoras") @Getter @Setter private Integer tiempoPromedioHoras;
  @JsonProperty("totalHombres") @Getter @Setter private Integer totalHombres;
  @JsonProperty("totalMujeres") @Getter @Setter private Integer totalMujeres;
  @JsonProperty("edadPromedioHombres") @Getter @Setter private Integer edadPromedioHombres;
  @JsonProperty("edadPromedioMujeres") @Getter @Setter private Integer  edadPromedioMujeres; 
}
