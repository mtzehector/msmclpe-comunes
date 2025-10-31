/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.bitacora.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.BitacoraEnum;
import mx.gob.imss.dpes.common.enums.TipoEstadoSolicitudEnum;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

import java.util.Date;

/**
 *
 * @author gabriel.rios
 */
public class BitacoraInterfaz extends BaseModel {

    @Getter
    @Setter
    private Long sesion;
    @Getter
    @Setter
    private Long idSolicitud;
    @Getter
    @Setter
    private Long idTipoServicio;
    @Getter
    @Setter
    private String descRequest;
    @Getter
    @Setter
    private String descRespuesta;
    @Getter
    @Setter
    private Long numTiempoResp;
    @Getter
    @Setter
    private Integer exito;
    @Getter
    @Setter
    private Long cveReporte;
    @Getter
    @Setter
    private String endpoint;
    @Getter
    @Setter
    private String reponseEndpoint;
    @Getter
    @Setter
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date altaRegistro;
    @Getter
    @Setter
    private String token;

    public BitacoraInterfaz() {
    }

    public BitacoraInterfaz(Long sesion, Long idSolicitud, Long idTipoServicio, String descRequest,
            String descRespuesta, Long numTiempoResp, Integer exito, Long cveReporte,
            String endpoint, String reponseEndpoint, String token, Date altaRegistro
    ) {
        this.sesion = sesion;
        this.idSolicitud = idSolicitud;
        this.idTipoServicio = idTipoServicio;
        this.descRequest = descRequest;
        this.descRespuesta = descRespuesta;
        this.numTiempoResp = numTiempoResp;
        this.exito = exito;
        this.cveReporte = cveReporte;
        this.endpoint = endpoint;
        this.reponseEndpoint = reponseEndpoint;
        this.token = token;
        this.altaRegistro = altaRegistro;
    }
    
    
}
