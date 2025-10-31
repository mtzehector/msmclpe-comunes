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
public enum EstadoFolioEnum {
  INICIADO(1L,"Iniciado"),
  PENDIENTE_MONTO_CAPTURAR(2L,"Pendiente Monto a Capturar"),
  POR_AUTORIZAR(3L,"Pendiente Monto a Capturar");
  
  private EstadoFolioEnum(Long estado, String descripcion) {
    this.estado = estado;
    this.descripcion = descripcion;        
  }
  
  @Getter Long estado;
  @Getter final String descripcion;
  
  private static final Map<Long, EstadoFolioEnum> map = new HashMap<>();
  
  static{
    map.put(INICIADO.estado, INICIADO);
    map.put(PENDIENTE_MONTO_CAPTURAR.estado, PENDIENTE_MONTO_CAPTURAR);
    map.put(POR_AUTORIZAR.estado, POR_AUTORIZAR);
  }
  
  @JsonCreator
  public static EstadoFolioEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, EstadoFolioEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
  
}
