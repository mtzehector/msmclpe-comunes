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
public class ReportePrestamosAutorizadosPorEFModel {
  @JsonProperty("delegacion") @Getter @Setter private   String DELEGACION;
  @JsonProperty("subDelegacion") @Getter @Setter private String SUBDELEGACION;
  @JsonProperty("entidadFinanciera") @Getter @Setter private String ENTIDAD_FINANCIERA;
  @JsonProperty("pivote") @Getter @Setter private BigDecimal PIVOTE;
  @JsonProperty("totalAutorizados") @Getter @Setter private BigDecimal TOTAL_AUTORIZADOS;
  @JsonProperty("importePromedio") @Getter @Setter private BigDecimal IMPORTE_PROMEDIO;
  @JsonProperty("descuentoPromedio") @Getter @Setter private BigDecimal DESCUENTO_PROMEDIO;
  @JsonProperty("mesesPromedio") @Getter @Setter private BigDecimal MESES_PROMEDIO;
  @JsonProperty("catPromedio") @Getter @Setter private BigDecimal CAT_PROMEDIO;
    
}
