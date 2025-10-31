/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
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
public class PrestamoAutorizadoDetalleDelegacion extends BaseModel {

    @Getter
    @Setter
    String delegacion;
    @Getter
    @Setter
    String subDelegacion;
    @Getter
    @Setter
    Integer totalRecuperacion;
    @Getter
    @Setter
    Integer totalCreditos;
    @Getter
    @Setter
    Integer totalLiquidados;
    @Getter
    @Setter
    Integer liquidadosCartera;
    @Getter
    @Setter
    Integer liquidadosRenovados;
    @Getter
    @Setter
    Integer liquidadosEnPlazo;
    @Getter
    @Setter
    Integer bajasPorEF;
    @Getter
    @Setter
    Integer bajasPorDefuncion;
    @Getter
    @Setter
    Integer subtotalCredito;
}
