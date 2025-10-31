/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

/**
 *
 * @author antonio
 */
public enum TipoSimulacionEnum {
  MONTO(1L,"Monto"),
  DESCUENTO_MENSUAL(2L,"Descuento mensual");
  
  private TipoSimulacionEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, TipoSimulacionEnum> map = new HashMap<>();
  
  static{
    map.put(MONTO.id, MONTO);
    map.put(DESCUENTO_MENSUAL.id, DESCUENTO_MENSUAL);    
  }
  
  @JsonCreator
  public static TipoSimulacionEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, TipoSimulacionEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
  
}
