/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.bitacora.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.BitacoraEnum;
import mx.gob.imss.dpes.common.enums.TipoEstadoSolicitudEnum;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author antonio
 */
public class Bitacora extends BaseModel {

    @Getter
    @Setter
    String curp;
    @Getter
    @Setter
    Long sesion;
    @Getter
    @Setter
    Long idSolicitud;
    @Getter
    @Setter
    BitacoraEnum tipo;
    @Getter
    @Setter
    TipoEstadoSolicitudEnum estadoSolicitud;
    @Getter
    @Setter
    String altaRegistro;

    public Bitacora() {
    }

    public Bitacora(String curp, Long sesion, Long idSolicitud, BitacoraEnum tipo, TipoEstadoSolicitudEnum estadoSolicitud) {
        this.curp = curp;
        this.sesion = sesion;
        this.idSolicitud = idSolicitud;
        this.tipo = tipo;
        this.estadoSolicitud = estadoSolicitud;
    }
    
    
}
