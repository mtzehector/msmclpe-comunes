/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.notificacion.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author edgar.arenas
 */

public class NotificacionConsultaRequest extends IdentityBaseModel<Long>{
    
    @Getter @Setter private String nss;
    @Getter @Setter private String folioNotificacion;
    @Getter @Setter private String folioPrestamo;
    @Getter @Setter private Long cveEstadoNotificacion;
    @Getter @Setter private Long cveEntidadFinanciera;
    @Getter @Setter private Long cveTipoNotificacion;
    @Getter @Setter private Long cveSubTipoNotificacion;
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private Date fechaRegistroInicio;
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private Date fechaRegistroFin;
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private Date fechaVencimientoInicio;
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private Date fechaVencimientoFin;
}
