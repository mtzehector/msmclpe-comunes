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
public class Prestamo extends BaseModel{
  @Getter @Setter private Long id;
  @Getter @Setter private Double monto;
  @Getter @Setter private Integer periodoNomina;
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  @Getter @Setter private Date primerDescuento;
  @Getter @Setter private Long solicitud;
  @JsonDeserialize( using = CustomDateDeserializer.class )
  @JsonSerialize(using = CustomDateSerializer.class)
  @Getter @Setter private Date altaRegistro;
  @Getter @Setter private Long idOferta;
  @Getter @Setter private TipoSimulacionEnum tipoSimulacion;
  @Getter @Setter private Double impMontoSol;
  @Getter @Setter private Double impTotalPagar;
  @Getter @Setter private TipoCreditoEnum tipoCredito;
  @Getter @Setter private Integer tipoCreditoId;
  @Getter @Setter private String refCuentaClabe;
  @Getter @Setter private Integer numPeriodoNomina;
  @Getter @Setter private Double impDescNomina;
  @Getter @Setter private Long promotor;
  @Getter @Setter private Oferta oferta = new Oferta();
  @Getter @Setter private String catPrestamoPromotor;
  @Getter @Setter private Double importeARecibir;
  @Getter @Setter private Integer numMesesConsecutivos;

}
