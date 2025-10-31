/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.solicitud.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author gabriel.rios
 */
public class EstadoSolicitud extends BaseModel {

    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    private String desEstadoSolicitud;
    @Getter
    @Setter
    private String desPensionadoEstadoSolicitud;

    public EstadoSolicitud() {
    }

    public EstadoSolicitud(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EstadoSolicitud{" + "id=" + id + ", desEstadoSolicitud=" + desEstadoSolicitud + ", desPensionadoEstadoSolicitud=" + desPensionadoEstadoSolicitud + '}';
    }

}
