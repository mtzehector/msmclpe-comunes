/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoCreditoEnum;
import mx.gob.imss.dpes.common.enums.TipoSimulacionEnum;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;
import java.util.Date;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.Oferta;

/**
 *
 * @author antonio
 */
public class PrestamoVigente extends BaseModel{
  @Getter @Setter private Long id;
  @Getter @Setter private Double monto;
  @Getter @Setter private Double descuentoMensual;
  @Getter @Setter private Double cat;
  @Getter @Setter private String nomEntidadFinanciera;
   

}
