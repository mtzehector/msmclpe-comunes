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
public enum OrigenSolicitudEnum {
  SIMULACION(1L,"Simulación"),
  CARTA_CAPACIDAD_CREDITO(2L,"Carta de capacidad de crédito"),
  HISTORICO(3L,"Histórico"),
  PRESTAMO_PROMOTOR(4L,"Promotor"),
  REINSTALACION(5L,"Reinstalación");
  
  private OrigenSolicitudEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, OrigenSolicitudEnum> map = new HashMap<>();
  
  static{
    map.put(SIMULACION.id, SIMULACION);
    map.put(CARTA_CAPACIDAD_CREDITO.id, CARTA_CAPACIDAD_CREDITO);
    map.put(HISTORICO.id, HISTORICO);
    map.put(PRESTAMO_PROMOTOR.id, PRESTAMO_PROMOTOR);
    map.put(REINSTALACION.id, REINSTALACION);
  }
  
  @JsonCreator
  public static OrigenSolicitudEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, OrigenSolicitudEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
  
}
