/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class PrestamoAutorizadoPorEF extends BaseModel {

    @Getter
    @Setter
    private String delegacion;
    @Getter
    @Setter
    private String subDelegacion;
    @Getter
    @Setter
    private String entidadFinanciera;
    @Getter
    @Setter
    private Integer totalAutorizados;
    @Getter
    @Setter
    private Double importePromedio;
    @Getter
    @Setter
    private Double catPromedio;
    @Getter
    @Setter
    private Double descuentoPromedio;
    @Getter
    @Setter
    private Double mesesPromedio;

}
