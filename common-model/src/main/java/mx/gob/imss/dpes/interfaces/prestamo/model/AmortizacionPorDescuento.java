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
public class AmortizacionPorDescuento extends BaseModel{

    public AmortizacionPorDescuento(Integer periodo, Double saldo, Double capital, Double intereses, Double iva, Double descuento) {
        this.periodo = periodo;
        this.saldo = saldo;
        this.capital = capital;
        this.intereses = intereses;
        this.iva = iva;
        this.descuento = descuento;
    }

    public AmortizacionPorDescuento() {
    }
    
    @Getter @Setter private Integer periodo;
    @Getter @Setter private Double saldo;
    @Getter @Setter private Double capital;
    @Getter @Setter private Double intereses;
    @Getter @Setter private Double iva;
    @Getter @Setter private Double descuento;
}

