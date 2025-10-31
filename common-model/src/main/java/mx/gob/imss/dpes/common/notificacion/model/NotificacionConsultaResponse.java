/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.notificacion.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author edgar.arenas
 */
@Data
public class NotificacionConsultaResponse extends BaseModel{

    private Long id;
    private Long cveEntidadFinanciera;
    private String nombreEntidadFinanciera;
    private Long cveTipoNotificacion;
    private String descTipoNotificacion;
    private Short cveSubTipoNotificacion;
    private String descSubTipoNotificacion;
    private String fecVencimiento;
    private String descNotificacion;
    private String reqNotificacion;
    private String folioNotificacion;
    private Long cveEstadoNotificacion;
    private String descEstadoNotificacion;
    private String altaRegistro;
    
}
