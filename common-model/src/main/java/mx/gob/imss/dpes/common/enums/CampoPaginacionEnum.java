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
public enum CampoPaginacionEnum {
  CPAGE_MCLPE(1L),
  CSTART_SPES(2L),
  CEND_SPES(3L),
  CTOTAL_PAGES(4L);
  
  private CampoPaginacionEnum(Long id) {
    this.id = id;
  }
  
  @Getter Long id;
  
  private static final Map<Long, CampoPaginacionEnum> map = new HashMap<>();
  
  static{
    map.put(CPAGE_MCLPE.id,CPAGE_MCLPE);
    map.put(  CSTART_SPES.id,  CSTART_SPES);
    map.put(  CEND_SPES.id,  CEND_SPES);
    map.put(  CTOTAL_PAGES.id,  CTOTAL_PAGES);


  }
  
  @JsonCreator
  public static CampoPaginacionEnum forValue(Long value) {
      return map.get(value);
  }
  
  @JsonValue
  public Long toValue() {
    for (Map.Entry<Long, CampoPaginacionEnum> entry : map.entrySet() ) {
      if (entry.getValue( ) == this )
        return entry.getKey();
    }
    return null;
  }
  
}
