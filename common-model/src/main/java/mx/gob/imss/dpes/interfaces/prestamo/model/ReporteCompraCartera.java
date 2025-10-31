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
public class ReporteCompraCartera extends BaseModel{
    /*
    Entidad Financiera (nombre comercial)
Número de proveedor
Periodo (de acuerdo a lo solicitado)
Fecha de emisión (fecha del sistema) y los datos de:
• Consecutivo	--java
Folio
•	NSS
•	CURP
•	Nombre Completo
•	Importe del préstamo
•	Descuento mensual
•	Número de descuento
•	Importe liquidado 
•	CAT		

    
    */
    @Getter @Setter private  String nombreComercial;
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
    @Getter @Setter private  Double saldoCapital;
    @Getter @Setter private  Integer mejorOferta;
    @Getter @Setter private  Long cveEntidadFinanciera;
    @Getter @Setter private  String clabe;    
    @Getter @Setter private  String correoAdminEF;  
}
