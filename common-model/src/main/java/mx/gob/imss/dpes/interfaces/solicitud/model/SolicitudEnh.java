/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.solicitud.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author eduardo.loyo
 */
public class SolicitudEnh extends BaseModel {

    @Getter @Setter Long id;
    @Getter @Setter OrigenSolicitud cveOrigenSolicitud;
    @Getter @Setter EstadoSolicitud cveEstadoSolicitud;
    @Getter @Setter String numFolioSolicitud;
    @Getter @Setter String refTrabajador;
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter Date fecVigenciaFolio;
    @Getter @Setter String consecutivo;
    @Getter @Setter String numAnio;    
    @JsonDeserialize( using = CustomDateDeserializer.class )
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter Date altaRegistro;
    @NotEmpty(message = "curpNull" ) @Getter @Setter String curp;
    @NotEmpty(message = "nssNull" ) @Getter @Setter String nss;
    @NotEmpty(message = "delegacionNull") @Getter @Setter String delegacion;
    @Getter @Setter String subDelegacion;
    @NotEmpty(message = "grupoFamiliarNull" ) @Getter @Setter String grupoFamiliar;
    @Getter @Setter Long entidadFederativa;
    
    

    
}
