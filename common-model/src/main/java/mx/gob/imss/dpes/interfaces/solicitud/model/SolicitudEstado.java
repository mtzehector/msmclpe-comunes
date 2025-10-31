package mx.gob.imss.dpes.interfaces.solicitud.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class SolicitudEstado extends BaseModel {

    @Getter
    @Setter
    private Long idSolicitud;

    @Getter
    @Setter
    private Long idEstado;

    @Getter
    @Setter
    private Solicitud solicitud;

    public SolicitudEstado() {
    }

    public SolicitudEstado(Long idSolicitud, Long idEstado) {
        this.idSolicitud = idSolicitud;
        this.idEstado = idEstado;
    }

}
