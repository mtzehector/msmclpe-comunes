/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class PrestamoRecuperacion extends BaseModel{
    
    @Getter @Setter private  Long id;
    @Getter @Setter private  Long prestamo;
    @Getter @Setter private  Long solicitud;
    @Getter @Setter private  String numSolicitudSipre;
    @Getter @Setter private  Double canMontoSol;
    @Getter @Setter private  Double canDescuentoMensual;
    @Getter @Setter private  Double impRealPrestamo;
    @Getter @Setter private  Double canCatPrestamo;
    @Getter @Setter private  Integer numPlazoPrestamo;
    @Getter @Setter private  Integer numMesRecuperado;
    @Getter @Setter private  String numEntidadFinanciera;
    @Getter @Setter private  Double impSumaDescMensual;
    @Getter @Setter private  String nombreComercial;
    @Getter @Setter private  Double saldoCapital;
    @Getter @Setter private  Integer mejorOferta;
    @Getter @Setter private  Long cveEntidadFinanciera;
    @Getter @Setter private  String clabe;    
    @Getter @Setter private  String correoAdminEF;  
    @Getter @Setter private  Long montoActualizado;
    @Getter @Setter private  String referencia;
    @Getter @Setter private  String numFolioSolicitud;
    // Número de meses consecutivos sin recuperación para la reinstalación
    @Getter @Setter private  Integer numMesesConsecutivos;
}
