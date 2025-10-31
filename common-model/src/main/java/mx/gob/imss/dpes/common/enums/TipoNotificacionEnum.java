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
 * @author edgar.arenas
 */
public enum TipoNotificacionEnum {
   
  QUEJA(1L,"Queja"),
  REQUERIMIENTO(2L,"Requerimiento"),
  SANSION(3L,"Sanción"),
  CONCILIACION(4L,"Conciliación"),
  AVISO(5L,"Aviso"),
  COMUNICADO(6L,"Comunicado");
  
  private TipoNotificacionEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, TipoNotificacionEnum> map = new HashMap<>();
  
  static{
    map.put(QUEJA.id, QUEJA);
    map.put(REQUERIMIENTO.id, REQUERIMIENTO);
    map.put(SANSION.id, SANSION);
    map.put(CONCILIACION.id, CONCILIACION);
    map.put(AVISO.id, AVISO);
    map.put(COMUNICADO.id, COMUNICADO);
  }
  
  @JsonCreator
  public static TipoNotificacionEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, TipoNotificacionEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
}
