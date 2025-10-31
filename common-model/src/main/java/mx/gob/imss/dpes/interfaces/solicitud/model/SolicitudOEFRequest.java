/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.solicitud.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoEstadoSolicitudEnum;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author eduardo.loyo
 */
public class SolicitudOEFRequest extends IdentityBaseModel<Long> {

    @Getter
    @Setter
    String nss;
    @Getter
    @Setter
    String folio;
    @Getter
    @Setter
    TipoEstadoSolicitudEnum estadoSolicitud;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date inicio;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date fin;
    @Getter
    @Setter
    Long cveEntidadFinanciera;
    @Getter
    @Setter
    Integer flagRol;
    @Getter
    @Setter
    Long cvePromotor;
    @Getter
    @Setter
    Boolean flagEstadoML = false;
    @Getter
    @Setter
    Boolean flagExcel = false;
    @Getter
    @Setter
    Boolean flagMontoL = false;
    @Getter
    @Setter
    List<List<Long>> solicitudes; 

}
