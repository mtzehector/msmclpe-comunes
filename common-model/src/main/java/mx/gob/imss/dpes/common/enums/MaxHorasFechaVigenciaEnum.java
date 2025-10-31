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
 * @author gabriel.rios
 */
public enum MaxHorasFechaVigenciaEnum {
  MAX_PEOR_OPCION(240L,"Maximo tiempo peor opcion en horas"),
  MAX_MEJOR_OPCION(192L,"Maximo tiempo mejor opcion en horas");
  
  private MaxHorasFechaVigenciaEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, MaxHorasFechaVigenciaEnum> map = new HashMap<>();
  
  static{
    map.put(MAX_PEOR_OPCION.id, MAX_PEOR_OPCION);
    map.put(MAX_MEJOR_OPCION.id, MAX_MEJOR_OPCION);    
  }
  
  @JsonCreator
  public static MaxHorasFechaVigenciaEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, MaxHorasFechaVigenciaEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
  
}
