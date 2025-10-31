/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesEstadisticos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 * 
 */
public class ReportePrestamosAutorizadosDetalleEFModel {
  @JsonProperty("entidadFinanciera") @Getter @Setter private String ENTIDAD_FINANCIERA;
  @JsonProperty("pivote") @Getter @Setter private BigDecimal PIVOTE;
  @JsonProperty("totalAutorizados") @Getter @Setter private BigDecimal TOTAL_AUTORIZADOS;
  @JsonProperty("importePromedio") @Getter @Setter private BigDecimal IMPORTE_PROMEDIO;
  @JsonProperty("descuentoPromedio") @Getter @Setter private BigDecimal DESCUENTO_PROMEDIO;
  @JsonProperty("mesesPromedio") @Getter @Setter private BigDecimal MESES_PROMEDIO;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal CAT_PROMEDIO;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal SIMULACION_NUEVOS;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal SIMULACION_RENOVACION;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal SIMULACION_CARTERA;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal PROMOTOR_NUEVOS;             
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal PROMOTOR_RENOVACION;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal PROMOTOR_CARTERA;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal TOTAL_HOMBRES;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal TOTAL_MUJERES;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal EDAD_PROMEDIO_HOMBRES;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal  EDAD_PROMEDIO_MUJERES;      
}

