/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.bitacora.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.notificacion.model.EstadoNotificacion;

/**
 *
 * @author edgar.arenas
 */
@Data
public class BitacoraNotificacion extends BaseModel {
    
    private Long id;
    private Long cveNotificacion;
    private Long cveEstadoNotificacion;
    private String curp;
    private String fecNuevoVencimiento;
    private EstadoNotificacion estadoNotificacion;
    private String altaRegistro;

}
