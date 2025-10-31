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
public class ReportePrestamosAutorizadosDetallePorDelegacionModel {
    
   @JsonProperty("delegacion") @Getter @Setter private String DELEGACION;
  @JsonProperty("subDelegacion") @Getter @Setter private String SUBDELEGACION;
  @JsonProperty("pivote") @Getter @Setter private BigDecimal PIVOTE;
  @JsonProperty("pivote2") @Getter @Setter private BigDecimal PIVOTE2;  
  @JsonProperty("totalRecuperacion") @Getter @Setter private BigDecimal TOTAL_RECUPERACION;
  @JsonProperty("totalCreditos") @Getter @Setter private BigDecimal TOTAL_CREDITOS;
  @JsonProperty("totalLiquidados") @Getter @Setter private BigDecimal TOTAL_LIQUIDADOS;
  @JsonProperty("liquidadosCartera") @Getter @Setter private BigDecimal LIQUIDADOS_CARTERA;
  @JsonProperty("liquidadosRenovados") @Getter @Setter private BigDecimal LIQUIDADOS_RENOVADOS;
  @JsonProperty("liquidadosEnPlazo") @Getter @Setter private BigDecimal LIQUIDADOS_EN_PLAZO;
  @JsonProperty("bajasPorEF") @Getter @Setter private BigDecimal BAJAS_POR_EF;
  @JsonProperty("bajasPorDefuncion") @Getter @Setter private BigDecimal BAJAS_POR_DEFUNCION;             
  @JsonProperty("subtotalCredito") @Getter @Setter private BigDecimal SUBTOTAL_CREDITO;
   
}
