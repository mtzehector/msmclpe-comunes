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
 * @author osiris.hernandez
 */
public enum TipoPersonaEFEnum {
  PROMOTOR(1L,"Promotor"),
  OPERADOR_ENTIDAD_FINANCIERA(2L,"Operador Entidad Financiera");
  
  private TipoPersonaEFEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, TipoPersonaEFEnum> map = new HashMap<>();
  
  static{
    map.put(PROMOTOR.id, PROMOTOR);
    map.put(OPERADOR_ENTIDAD_FINANCIERA.id, OPERADOR_ENTIDAD_FINANCIERA);    
  }
  
  @JsonCreator
  public static TipoPersonaEFEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, TipoPersonaEFEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
}
