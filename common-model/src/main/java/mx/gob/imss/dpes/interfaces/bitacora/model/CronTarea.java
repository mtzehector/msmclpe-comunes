/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.solicitud.model.Solicitud;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author juan.garfias
 */
public class CronTarea extends BaseModel {

    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    Long cveSolicitud;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date fechaLimite;

    @Getter
    @Setter
    TareaAccion tareaAccion;

    @Getter
    @Setter
    List<EstadoOrigen> lstEstadosOrigen;

    @Getter
    @Setter
    Solicitud solicitud;

    @Getter
    @Setter
    Long activo;

    @Getter
    @Setter
    Long ejecutado;
}
