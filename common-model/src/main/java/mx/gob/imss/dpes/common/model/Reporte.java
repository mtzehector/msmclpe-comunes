/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 *
 * @author antonio
 */

public class Reporte<M extends BaseModel> extends BaseModel{
  @Getter @Setter String ruta;  
  @Getter @Setter String password;
  @Getter private List<M> beans = new ArrayList<>();
  @Getter @Setter byte[] pdf;
  @Override
    public String toString() {
      return ReflectionToStringBuilder.toStringExclude(this, "pdf");
    }
}
