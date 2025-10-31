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
import mx.gob.imss.dpes.common.enums.OrigenSolicitudEnum;
import mx.gob.imss.dpes.common.enums.TipoEstadoSolicitudEnum;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.EntidadFinanciera;
import mx.gob.imss.dpes.interfaces.prestamo.model.Prestamo;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.Persona;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author eduardo.loyo
 */
public class Solicitud extends BaseModel {

    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    OrigenSolicitudEnum origenSolictud;
    @Getter
    @Setter
    TipoEstadoSolicitudEnum estadoSolicitud;
    @Getter
    @Setter
    String numFolioSolicitud;
    @Getter
    @Setter
    String refTrabajador;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date fecVigenciaFolio;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date fecSIPREModifica;
    @Getter
    @Setter
    String consecutivo;
    @Getter
    @Setter
    String numAnio;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date altaRegistro;
    @NotEmpty(message = "curpNull")
    @Getter
    @Setter
    String curp;
    @NotEmpty(message = "nssNull")
    @Getter
    @Setter
    String nss;
    @NotEmpty(message = "delegacionNull")
    @Getter
    @Setter
    String delegacion;
    @Getter
    @Setter
    String subDelegacion;
    @NotEmpty(message = "grupoFamiliarNull")
    @Getter
    @Setter
    String grupoFamiliar;
    @Getter
    @Setter
    Long entidadFederativa;
    @Getter
    @Setter
    EstadoSolicitud cveEstadoSolicitud = new EstadoSolicitud();
    @Getter
    @Setter
    OrigenSolicitud cveOrigenSolicitud = new OrigenSolicitud();
    @Getter
    @Setter
    Long cveEntidadFinanciera;
    @Getter
    @Setter
    String idSolPrestamo;
    @Getter
    @Setter
    int isSPES = 0;
    @Getter
    @Setter
    String idSolPrFinanciero;
    @Getter
    @Setter
    Long cvePromotor;
    @Getter
    @Setter
    int mejorOferta;
    @Getter
    @Setter
    int indSIPREStatus;
    @Getter
    @Setter
    String cveEntidadFinMejorOferta;
    @Getter
    @Setter
    int maxHoursFechaVigencia;
    @Getter
    @Setter
    Persona persona;
    @Getter
    @Setter
    EntidadFinanciera entidadFinanciera;
    @Getter
    @Setter
    Prestamo prestamo;

    public Solicitud() {
    }

    public Solicitud(Long id, OrigenSolicitudEnum origenSolictud, TipoEstadoSolicitudEnum estadoSolicitud, String numFolioSolicitud, String refTrabajador, Date fecVigenciaFolio, Date fecSIPREModifica, String consecutivo, String numAnio, Date altaRegistro, String curp, String nss, String delegacion, String subDelegacion, String grupoFamiliar, Long entidadFederativa, Long cveEntidadFinanciera, String idSolPrestamo, String idSolPrFinanciero, Long cvePromotor, int mejorOferta, int indSIPREStatus, String cveEntidadFinMejorOferta, int maxHoursFechaVigencia, Persona persona, EntidadFinanciera entidadFinanciera) {
        this.id = id;
        this.origenSolictud = origenSolictud;
        this.estadoSolicitud = estadoSolicitud;
        this.numFolioSolicitud = numFolioSolicitud;
        this.refTrabajador = refTrabajador;
        this.fecVigenciaFolio = fecVigenciaFolio;
        this.fecSIPREModifica = fecSIPREModifica;
        this.consecutivo = consecutivo;
        this.numAnio = numAnio;
        this.altaRegistro = altaRegistro;
        this.curp = curp;
        this.nss = nss;
        this.delegacion = delegacion;
        this.subDelegacion = subDelegacion;
        this.grupoFamiliar = grupoFamiliar;
        this.entidadFederativa = entidadFederativa;
        this.cveEntidadFinanciera = cveEntidadFinanciera;
        this.idSolPrestamo = idSolPrestamo;
        this.idSolPrFinanciero = idSolPrFinanciero;
        this.cvePromotor = cvePromotor;
        this.mejorOferta = mejorOferta;
        this.indSIPREStatus = indSIPREStatus;
        this.cveEntidadFinMejorOferta = cveEntidadFinMejorOferta;
        this.maxHoursFechaVigencia = maxHoursFechaVigencia;
        this.persona = persona;
        this.entidadFinanciera = entidadFinanciera;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "id=" + id + ", origenSolictud=" + origenSolictud + ", estadoSolicitud=" + estadoSolicitud + ", numFolioSolicitud=" + numFolioSolicitud + ", refTrabajador=" + refTrabajador + ", fecVigenciaFolio=" + fecVigenciaFolio + ", fecSIPREModifica=" + fecSIPREModifica + ", consecutivo=" + consecutivo + ", numAnio=" + numAnio + ", altaRegistro=" + altaRegistro + ", curp=" + curp + ", nss=" + nss + ", delegacion=" + delegacion + ", subDelegacion=" + subDelegacion + ", grupoFamiliar=" + grupoFamiliar + ", entidadFederativa=" + entidadFederativa + ", cveEstadoSolicitud=" + cveEstadoSolicitud + ", cveOrigenSolicitud=" + cveOrigenSolicitud + ", cveEntidadFinanciera=" + cveEntidadFinanciera + ", idSolPrestamo=" + idSolPrestamo + ", isSPES=" + isSPES + ", idSolPrFinanciero=" + idSolPrFinanciero + ", cvePromotor=" + cvePromotor + ", mejorOferta=" + mejorOferta + ", indSIPREStatus=" + indSIPREStatus + ", cveEntidadFinMejorOferta=" + cveEntidadFinMejorOferta + ", maxHoursFechaVigencia=" + maxHoursFechaVigencia + ", persona=" + persona + ", entidadFinanciera=" + entidadFinanciera + '}';
    }

}
