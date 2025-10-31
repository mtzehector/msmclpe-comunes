/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class AmortizacionInsumos extends BaseModel{
    @Getter @Setter private Double importeMontoSolicitado;
    @Getter @Setter private Double importeDescuentoMensual;
    @Getter @Setter private Double importeTotalPagar;
    @Getter @Setter private Integer plazo;
    @Getter @Setter private Double cat;
    @Getter @Setter private Long cveSolicitud;
    @Getter @Setter private Integer numMensualidad;
    @Getter @Setter private String folioSipre;
    @Getter @Setter private Long cveTipoSimulacion;
    @Getter @Setter private Integer historico;
    @Getter @Setter private Double saldoCapital;
    @Getter @Setter private Integer test;
    @Getter @Setter private String numFolioSolicitud;
    
}
