/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.notificacion.model;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.BitacoraNotificacion;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.EntidadFinanciera;

/**
 *
 * @author edgar.arenas
 */
public class Notificacion extends BaseModel {
    
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Long cveEntidadFinanciera;
    @Getter
    @Setter
    private Long cveTipoNotificacion;
    @Getter
    @Setter
    private Short cveSubTipoNotificacion;
    @Getter
    @Setter
    private String fecVencimiento;
    @Getter
    @Setter
    private String descNotificacion;
    @Getter
    @Setter
    private String reqNotificacion;
    @Getter
    @Setter
    private String resolucion;
    @Getter
    @Setter
    private String folioNotificacion;
    @Getter
    @Setter
    private Long cveEstadoNotificacion;
    @Getter
    @Setter
    private String nomComercialEf; 
    @Getter
    @Setter
    private NotificacionPrestamo notPrestamo;
    @Getter
    @Setter
    private List<DocumentoNotificacion> mcltNotificacionDocumento;
    @Getter
    @Setter
    private TipoNotificacion tipoNotificacion;
    @Getter
    @Setter
    private SubTipoNotificacion subTipoNotificacion;
    @Getter
    @Setter
    private String altaRegistro;
    @Getter
    @Setter
    private EstadoNotificacion estadoNotificacion;
    @Getter
    @Setter
    EntidadFinanciera entidadFinanciera;
    @Getter
    @Setter
    private Set<BitacoraNotificacion> setBitacora;
}
