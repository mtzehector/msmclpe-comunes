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
public enum TipoCreditoEnum {
  NUEVO(1L,"Nuevo"),
  RENOVACION(2L,"Renovación"),
  COMPRA_CARTERA(3L,"Compra de cartera"),
  MIXTO(6L,"Mixto");

  private TipoCreditoEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, TipoCreditoEnum> map = new HashMap<>();
  
  static{
    map.put(NUEVO.id, NUEVO);
    map.put(RENOVACION.id, RENOVACION);
    map.put(COMPRA_CARTERA.id, COMPRA_CARTERA);
    map.put(MIXTO.id, MIXTO);
  }
  
  @JsonCreator
  public static TipoCreditoEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, TipoCreditoEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
  
}
