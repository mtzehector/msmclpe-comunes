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
public enum EventEnum {
  CREAR_SOLICITUD_SIMULACION(1L),
  CREAR_SOLICITUD_CAPACIDAD_CREDITO(2L),
  CREAR_REPORTE_SIMULACION(3L),
  CREAR_REPORTE_CAPACIDAD_CREDITO(4L),
  CREAR_CARTA_INSTRUCCION(5L),
  CREAR_REPORTE_CARTA_INSTRUCCION(6L),
  CREAR_CORREO_AUTORIZACION_CARTA_INSTRUCCION(7L);
  
  private EventEnum(Long id) {
    this.id = id;
  }
  
  @Getter Long id;  
  
  private static final Map<Long, EventEnum> map = new HashMap<>();
  
  static{
    map.put(CREAR_SOLICITUD_SIMULACION.id, CREAR_SOLICITUD_SIMULACION);
    map.put(CREAR_SOLICITUD_CAPACIDAD_CREDITO.id, CREAR_SOLICITUD_CAPACIDAD_CREDITO);
    map.put(CREAR_CARTA_INSTRUCCION.id,CREAR_CARTA_INSTRUCCION);
    map.put(CREAR_REPORTE_CAPACIDAD_CREDITO.id,CREAR_REPORTE_CAPACIDAD_CREDITO);
    map.put(CREAR_REPORTE_CARTA_INSTRUCCION.id,CREAR_REPORTE_CARTA_INSTRUCCION);
    map.put(CREAR_REPORTE_SIMULACION.id,CREAR_REPORTE_SIMULACION);
    map.put(CREAR_CORREO_AUTORIZACION_CARTA_INSTRUCCION.id,CREAR_CORREO_AUTORIZACION_CARTA_INSTRUCCION);
  }
  
  @JsonCreator
  public static EventEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, EventEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
  
}
