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
public class ConsultaEstadosSPESRequest extends BaseModel {

    @Getter
    @Setter
    private String nss;
    @Getter
    @Setter
    private String grupoFamiliar;

    public ConsultaEstadosSPESRequest(String nss, String grupoFamiliar) {
        this.nss = nss;
        this.grupoFamiliar = grupoFamiliar;
    }

    public ConsultaEstadosSPESRequest() {
    }

}
