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
public enum SubTipoNotificacionEnum {
    
  CARTA_LIQUIDACION(1L,"Carta Liquidación"),
  CONDICION_PRESTAMO(2L,"Condiciones del préstamo"),
  DESCUENTOS_DEMASIA(3L,"Descuentos en demasia"),
  OTRO_QUEJA(4L,"Otro"),
  PRESTAMO_NO_RECONOCIDO(5L,"Préstamo no reconocido"),
  DOCUMENTACION(6L,"Documentación"),
  INFORMACION(7L,"Información"),
  OTRO_REQUERIMIENTO(8L,"Otro"),
  OTRO_SANCION(9L,"Otro"),
  SUSPENCION_DESCUENTO(10L,"Suspensión de descuento"),
  SUSPENSION_PARCIAL(11L,"Suspensión parcial temporal"),
  SUSPENSION_TOTAL(12L,"Suspensión total temporal"),
  TERMINACION(13L,"Terminación anticipada"),
  NUEVO_CONCILIACION(14L,"Nuevo"),
  NUEVO_AVISO(15L,"Nuevo"),
  NUEVO_COMUNICADO(16L,"Nuevo");
  
  private SubTipoNotificacionEnum(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;        
  }
  
  @Getter Long id;
  @Getter final String descripcion;
  
  private static final Map<Long, SubTipoNotificacionEnum> map = new HashMap<>();
  
  static{
    map.put(CARTA_LIQUIDACION.id, CARTA_LIQUIDACION);
    map.put(CONDICION_PRESTAMO.id, CONDICION_PRESTAMO);
    map.put(DESCUENTOS_DEMASIA.id, DESCUENTOS_DEMASIA);
    map.put(OTRO_QUEJA.id, OTRO_QUEJA);
    map.put(PRESTAMO_NO_RECONOCIDO.id, PRESTAMO_NO_RECONOCIDO);
    map.put(DOCUMENTACION.id, DOCUMENTACION);
    map.put(INFORMACION.id, INFORMACION);
    map.put(OTRO_REQUERIMIENTO.id, OTRO_REQUERIMIENTO);
    map.put(OTRO_SANCION.id, OTRO_SANCION);
    map.put(SUSPENCION_DESCUENTO.id, SUSPENCION_DESCUENTO);
    map.put(SUSPENSION_PARCIAL.id, SUSPENSION_PARCIAL);
    map.put(SUSPENSION_TOTAL.id, SUSPENSION_TOTAL);
    map.put(TERMINACION.id, TERMINACION);
    map.put(NUEVO_CONCILIACION.id, NUEVO_CONCILIACION);
    map.put(NUEVO_AVISO.id, NUEVO_AVISO);
    map.put(NUEVO_COMUNICADO.id, NUEVO_COMUNICADO);
  }
  
  @JsonCreator
  public static SubTipoNotificacionEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, SubTipoNotificacionEnum> entry : map.entrySet()) {
      if (entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
}
