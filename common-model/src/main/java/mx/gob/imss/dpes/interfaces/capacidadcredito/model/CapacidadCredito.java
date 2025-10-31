/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.capacidadcredito.model;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoCreditoEnum;
import mx.gob.imss.dpes.common.model.BaseModel;
/**
 *
 * @author antonio
 */
public class CapacidadCredito extends BaseModel{
  @NotNull(message = "impCapacidadTotal") @Getter @Setter private Double impCapacidadTotal;
  @NotNull(message = "impCapacidadFijaNull") @Getter @Setter private Double impCapacidadFija;
  @NotNull(message = "impCapacidadVariable") @Getter @Setter private Double impCapacidadVariable;
  @Getter @Setter private Long cveSolicitud;
  @Getter @Setter private TipoCreditoEnum tipoCredito;
}
