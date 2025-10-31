/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class ConciliacionEF extends BaseModel{
    
    private String nss;
    private String grupoFamiliar;
    private String folioSolicitud;
    private Double importeTotalPrestamo;
    private Double saldo;
    private Double descuentoMensual;
    private Integer totalMensualidades;
    private Integer numMensualidad;
    private String conceptoDescuento;
    private Double importeRecuperado;
    private String delegacion;
    private String contrato;
    private String causa;
    private String capacidadCredito;
    private String importeCobradoDemasia;
    private String fechaFallecimiento;
}
