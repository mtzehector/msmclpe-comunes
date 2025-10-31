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
public class ConsultaDescuentosPorSolicitudRequest extends BaseModel {

    @Getter
    @Setter
    private String idSolPrFinanciero;
    @Getter
    @Setter
    private String numFolioSolicitud;

    public ConsultaDescuentosPorSolicitudRequest(String idSolPrFinanciero, String numFolioSolicitud) {
        this.idSolPrFinanciero = idSolPrFinanciero;
        this.numFolioSolicitud = numFolioSolicitud;
    }

    public ConsultaDescuentosPorSolicitudRequest() {
    }

}
