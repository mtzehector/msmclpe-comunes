/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import java.util.List;
import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class EntidadFinancieraEncabezado extends BaseModel{
    
    private String razonSocial;
    private Long numProveedor;
    private String periodoNominal;
    private String fechaEmision;
    private String idEFSipre;
    private List<ConciliacionEF> prestamosRecuperados;
    private List<ConciliacionEF> prestamosNoRecuperados;
    private List<ConciliacionEF> prestamosBajaDefuncion;
}
