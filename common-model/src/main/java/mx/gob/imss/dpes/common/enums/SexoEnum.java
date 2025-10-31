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
public enum SexoEnum {
    
   MASCULINO(1,"Masculino"),
   FEMENINO(2,"Femenino"),
   AMBOS(3,"Ambos");
   
  private SexoEnum(int id, String descripcion) {
    this.id = (short) id;
    this.descripcion = descripcion;        
  }
  
  @Getter short id;
  @Getter final String descripcion;
  
  private static final Map<Short, SexoEnum> map = new HashMap<>();
  
  static{
    map.put(MASCULINO.id, MASCULINO);
    map.put(FEMENINO.id, FEMENINO);
    map.put(AMBOS.id, AMBOS);
  }
  
  @JsonCreator
  public static SexoEnum forValue(Short value) {
      return map.get(value);
  }
  
  @JsonValue
  public Short toValue() {
    for (Map.Entry<Short, SexoEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
  
}
