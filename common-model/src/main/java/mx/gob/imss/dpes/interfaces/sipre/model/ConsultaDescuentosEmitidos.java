/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class ConsultaDescuentosEmitidos extends BaseModel {

    @Getter
    @Setter
    private ConsultaDescuentoEmitidoRequest descuentosRequest;
    @Getter
    @Setter
    private ConsultaDescuentoEmitidoResponse descuentosResponse;

    public ConsultaDescuentosEmitidos() {
    }

    public ConsultaDescuentosEmitidos(ConsultaDescuentoEmitidoRequest descuentosRequest, ConsultaDescuentoEmitidoResponse descuentosResponse) {
        this.descuentosRequest = descuentosRequest;
        this.descuentosResponse = descuentosResponse;
    }

}
