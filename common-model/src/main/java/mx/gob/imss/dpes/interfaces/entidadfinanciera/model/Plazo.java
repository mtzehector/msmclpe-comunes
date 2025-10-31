/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.util.Objects;

/**
 *
 * @author Diego Velazquez
 */
public class Plazo extends BaseModel{

  @Getter @Setter private Long id;
  @Getter @Setter private Integer numPlazo;
  @Getter @Setter private String descripcion;

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Plazo))
      return false;

    if(o == null)
      return false;

    if(this == o)
      return true;

    Plazo plazo = (Plazo) o;
    return id == plazo.id;
  }
}
