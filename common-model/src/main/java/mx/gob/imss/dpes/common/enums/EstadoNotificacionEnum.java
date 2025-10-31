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
public enum EstadoNotificacionEnum {
    
  REGISTRADA(1L,"Registrada"),
  RECIBIDA(2L,"Recibida"),
  ATENDIDA(3L,"Atendida"),
  RECHAZADA(4L,"Rechazada"),
  CONCLUIDA(5L,"Concluida"),
  CANCELADA(6L,"Cancelada"),
  ENVIADA(7L,"Enviada");
  
  private EstadoNotificacionEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, EstadoNotificacionEnum> map = new HashMap<>();
  
  static{
    map.put(REGISTRADA.id, REGISTRADA);
    map.put(RECIBIDA.id, RECIBIDA);
    map.put(ATENDIDA.id, ATENDIDA);
    map.put(RECHAZADA.id, RECHAZADA);
    map.put(CONCLUIDA.id, CONCLUIDA);
    map.put(CANCELADA.id, CANCELADA);
    map.put(ENVIADA.id, ENVIADA);
  }
  
  @JsonCreator
  public static EstadoNotificacionEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, EstadoNotificacionEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
}
