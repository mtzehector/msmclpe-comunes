/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.sipre.model.PrestamosEnRecuperacion;
import mx.gob.imss.dpes.interfaces.sipre.model.ConsultaCapacidadRequest;

/**
 *
 * @author juan.garfias
 */
public class ConsultaPrestamosEnRecuperacionRQ extends BaseModel {

    @Getter
    @Setter
    private ConsultaCapacidadRequest prestamosEnRecuperacionRq;

    @Getter
    @Setter
    private PrestamosEnRecuperacion prestamosEnRecuperacionRs;
}
