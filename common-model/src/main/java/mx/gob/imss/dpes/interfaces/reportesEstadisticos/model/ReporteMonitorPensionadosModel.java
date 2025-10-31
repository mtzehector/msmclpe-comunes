/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesEstadisticos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 */
public class ReporteMonitorPensionadosModel {
    
  @JsonProperty("delegacion") @Getter @Setter private String DELEGACION;
  @JsonProperty("subDelegacion") @Getter @Setter private String SUBDELEGACION;
  @JsonProperty("pivote") @Getter @Setter private BigDecimal PIVOTE;
  @JsonProperty("pivote2") @Getter @Setter private BigDecimal PIVOTE2;
  @JsonProperty("totalSimulaciones") @Getter @Setter private BigDecimal TOTAL_SIMULACIONES;
  @JsonProperty("totalPrestamoPromotor") @Getter @Setter private BigDecimal TOTAL_PRESTAMO_PROMOTOR;
  @JsonProperty("simulacionesVigentes") @Getter @Setter private BigDecimal SIMULACIONES_VIGENTES;
  @JsonProperty("simulacionesCanceladas") @Getter @Setter private BigDecimal SIMULACIONES_CANCELADAS;
  @JsonProperty("tiempoPromedioHoras") @Getter @Setter private BigDecimal TIEMPO_PROMEDIO_HORAS;
  @JsonProperty("totalHombres") @Getter @Setter private BigDecimal TOTAL_HOMBRES;
  @JsonProperty("totalMujeres") @Getter @Setter private BigDecimal TOTAL_MUJERES;
  @JsonProperty("edadPromedioHombres") @Getter @Setter private BigDecimal EDAD_PROMEDIO_HOMBRES;
  @JsonProperty("edadPromedioMujeres") @Getter @Setter private BigDecimal  EDAD_PROMEDIO_MUJERES; 
}
