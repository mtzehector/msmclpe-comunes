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
public class NotificacionHome extends BaseModel{
 
    private Long cveEntidadFinanciera;
    private Long[] subTiposNotificacion;
    private Long[] estadosNotificacion;
    private Integer subTipoCartaLiq;
    private Integer subTipoCondPrestamo;
    private Integer subTipoDesDemasia;
    private Integer subTipoOtroQueja;
    private Integer subTipoPrestamoNoRec;
    private Integer subTipoDocumentacion;
    private Integer subTipoInformacion;
    private Integer subTipoOtroReq;
    private Integer subTipoOtroSancion;
    private Integer subTipoSuspencionDes;
    private Integer subTipoSuspensionParcial;
    private Integer subTipoSuspensionTotal;
    private Integer subTipoTermAnticipada;
    private Integer subTipoNuevoConc;
    private Integer subTipoNuevoAviso;
    private Integer subTipoNuevoComunicado;
    private Integer estadoNotifRegistradas;
    private Integer estadoNotifAtendidas;
    private Integer estadoNotifEnviadas;
}
