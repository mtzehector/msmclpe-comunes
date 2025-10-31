/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class PrestamoEstadoSpes extends BaseModel {

    @Getter
    @Setter
    private String curp;
    @Getter
    @Setter
    private Double impPrestamo;
    @Getter
    @Setter
    private Double impMensual;
    @Getter
    @Setter
    private Double catPrestamo;
    @Getter
    @Setter
    private String numFolioSolicitud;
    @Getter
    @Setter
    private String nomFinanciera;
    @Getter
    @Setter
    private String movimiento;
    @Getter
    @Setter
    private String fecInicioPrestamo;
    @Getter
    @Setter
    private String fecTermPrestamo;
    @Getter
    @Setter
    private String idSolPrestamo;
    @Getter
    @Setter
    private String insFinanciera;

}
