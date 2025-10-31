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
public class PrestamoAutorizadoDetallePorEF extends BaseModel {

    @Getter
    @Setter
    String entidadFinanciera;
    @Getter
    @Setter
    Double totalAutorizados;
    @Getter
    @Setter
    Double importePromedio;
    @Getter
    @Setter
    Double descuentoPromedio;
    @Getter
    @Setter
    Integer mesesPromedio;
    @Getter
    @Setter
    Double catPromedio;
    @Getter
    @Setter
    Integer simulacionNuevos;
    @Getter
    @Setter
    Integer simulacionRenovacion;
    @Getter
    @Setter
    Integer simulacionCartera;
    @Getter
    @Setter
    Integer promotorNuevos;
    @Getter
    @Setter
    Integer promotorRenovacion;
    @Getter
    @Setter
    Integer promotorCartera;
    @Getter
    @Setter
    Integer totalHombres;
    @Getter
    @Setter
    Integer totalMujeres;
    @Getter
    @Setter
    Integer edadPromedioHombres;
    @Getter
    @Setter
    Integer edadPromedioMujeres;

}
