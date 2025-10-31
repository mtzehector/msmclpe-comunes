/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.solicitud.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class SolicitudHome extends BaseModel{
    
    private Long cvePromotor;
    private Long cveEntidadFinanciera;
    private Long[] estadosSolicitud;
    private Integer solIniciados;
    private Integer solPendienteMontoLiq;
    private Integer solPorAutorizar;
    private Integer solPendienteCargaCEP;
    private Integer solAsignarPromotor;
    
}
