package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum TipoServicioEnum {
  NO_VALIDO(0L,"NO VALIDO"),
  SISTRAP(1L,"SISTRAP"),
  RENAPO(2L,"RENAPO"),
  SIAP(3L,"SIAP"),
  SINDO(4L,"SINDO"),
  BOVEDA(5L,"BOVEDA"),
  NOTARIA(6L,"NOTARIA"),
  SELLO_DIGITAL(7L,"SELLO_DIGITAL"),
  DOMICILIO(8L,"DOMICILIO"),
  OTRO(9L,"OTRO"),
  NET_IQ(10L,"NET_IQ"),
  BOVEDA_IPICYT(11L,"BOVEDA_IPICYT"),
  SIPRE2(12L,"SIPRE2");

  private TipoServicioEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, TipoServicioEnum> map = new HashMap<>();
  
  static{
    map.put(NO_VALIDO.id, NO_VALIDO);
    map.put(SISTRAP.id, SISTRAP);
    map.put(RENAPO.id, RENAPO);
    map.put(SIAP.id, SIAP);
    map.put(SINDO.id, SINDO);
    map.put(BOVEDA.id, BOVEDA);
    map.put(NOTARIA.id, NOTARIA);
    map.put(SELLO_DIGITAL.id, SELLO_DIGITAL);
    map.put(DOMICILIO.id, DOMICILIO);
    map.put(OTRO.id, OTRO);
    map.put(NET_IQ.id, NET_IQ);
    map.put(BOVEDA_IPICYT.id, BOVEDA_IPICYT);
    map.put(SIPRE2.id, SIPRE2);
  }
  
  @JsonCreator
  public static TipoServicioEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, TipoServicioEnum> entry : map.entrySet()) {
      if (entry.getValue() == this) {
        return entry.getKey();
      }
    }
    return null;
  }
  
}
