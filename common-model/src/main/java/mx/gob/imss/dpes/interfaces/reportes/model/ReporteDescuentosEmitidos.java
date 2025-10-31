/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.sipre.model.DescuentoEmitido;

/**
 *
 * @author juan.garfias
 */
@JsonInclude(Include.NON_NULL)
public class ReporteDescuentosEmitidos extends BaseModel {

    @Getter
    @Setter
    private Map<String, DescuentoEmitido> prestIncsttsMap;

    @Getter
    @Setter
    private Map<String, DescuentoEmitido> descuIncsttsMap;

    @Getter
    @Setter
    private Map<String, String> delegaciones;

    @Getter
    @Setter
    private Map<String, String> entidadesFinancieras;

    @Getter
    @Setter
    private Map<String, ReporteDescuentoEmitidoRow> reporteByDel;

    @Getter
    @Setter
    private Map<String, ReporteDescuentoEmitidoRow> reporteByEF;

    @Getter
    @Setter
    private String archivoXLSXBase64ByEF;

    @Getter
    @Setter
    private String archivoXLSXBase64ByDel;
    
    @Getter
    @Setter
    private String archivoTxtInconsistenciasPrestamoB64;

    @Getter
    @Setter
    private String archivoTxtInconsistenciasDescuentoB64;

    public ReporteDescuentosEmitidos() {
    }

}
