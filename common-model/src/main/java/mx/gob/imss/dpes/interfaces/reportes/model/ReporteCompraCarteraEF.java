/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class ReporteCompraCarteraEF extends BaseModel {

    @Getter
    @Setter
    private List<PrestamoRecuperacionCompraCarteraEF> prestamosCompraCarteraEF;

    @Getter
    @Setter
    private String archivoXLSX;
}
