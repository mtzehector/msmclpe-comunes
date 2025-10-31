/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author antonio
 */
public abstract class LogicDeletedModel<I extends Serializable> extends IdentityBaseModel<I> {

  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date altaRegistro;
  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date bajaRegistro;
  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date actualizacionRegistro;
  
  @Override
  public abstract I getId();

}
