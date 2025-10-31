/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoSimulacionEnum;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class PrestamoAmortizacion extends BaseModel{
    @Getter @Setter private TipoSimulacionEnum tipoSimulacion;
    @Getter @Setter private List<AmortizacionPorDescuento> tablaAmortizacion;
    @Getter @Setter private Double totalCapital;
    @Getter @Setter private Double totalIntereses;
    @Getter @Setter private Double totalIva;
    @Getter @Setter private Double totalDescuento;
}
