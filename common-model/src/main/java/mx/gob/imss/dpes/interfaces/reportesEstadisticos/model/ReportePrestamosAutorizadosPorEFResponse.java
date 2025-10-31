/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportesEstadisticos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ernesto.palacios
 * 
 */
public class ReportePrestamosAutorizadosPorEFResponse {
  @JsonProperty("delegacion") @Getter @Setter private   String delegacion;
  @JsonProperty("subDelegacion") @Getter @Setter private String subDelegacion;
  @JsonProperty("entidadFinanciera") @Getter @Setter private String entidadFinanciera;
  @JsonProperty("totalAutorizados") @Getter @Setter private Double totalAutorizados;
  @JsonProperty("importePromedio") @Getter @Setter private Double importePromedio;
  @JsonProperty("descuentoPromedio") @Getter @Setter private Double descuentoPromedio;
  @JsonProperty("mesesPromedio") @Getter @Setter private Integer mesesPromedio;
  @JsonProperty("catPromedio") @Getter @Setter private Double catPromedio;

    
}

