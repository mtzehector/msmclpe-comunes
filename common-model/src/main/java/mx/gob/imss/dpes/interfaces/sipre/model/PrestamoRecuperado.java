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
public class PrestamoRecuperado extends BaseModel {

    @Getter
    @Setter
    private Double impMensual; 
    @Getter
    @Setter
    private Double catPrestamo; 
    @Getter
    @Setter
    private Double impRealPrestamo;
    @Getter
    @Setter
    private Double numMeses;
    @Getter
    @Setter
    private String idSolPrestamo;
    @Getter
    @Setter
    private String insFinanciera; 
    @Getter
    @Setter
    private Long mesesRecuperados;
    @Getter
    @Setter
    private String nombreComercialEF; 
    @Getter
    @Setter
    private String nomFinanciera;
    @Getter
    @Setter
    private String clabe;
    @Getter
    @Setter
    private String nomEmail;
    @Getter
    @Setter
    private String numFolioSolicitud;

}
