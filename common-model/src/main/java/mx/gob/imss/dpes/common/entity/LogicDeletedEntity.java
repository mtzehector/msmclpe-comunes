/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.entity;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author antonio
 */
@MappedSuperclass
public abstract class LogicDeletedEntity<I extends Serializable> extends IdentityBaseModel<I> {

  @Basic(optional = false)
  @NotNull
  @Column(name = "fec_registro_alta", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date altaRegistro;
  @Column(name = "fec_registro_baja")
  @Temporal(TemporalType.TIMESTAMP)
  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date bajaRegistro;
  @Column(name = "fec_registro_actualizado")
  @Temporal(TemporalType.TIMESTAMP)
  @Getter
  @Setter
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date actualizacionRegistro;
  
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE,
            true);
  }
  
  @Override
  public abstract I getId();

}
