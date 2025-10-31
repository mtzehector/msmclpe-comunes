/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;
import mx.gob.imss.dpes.interfaces.domicilio.model.Domicilio;
import mx.gob.imss.dpes.interfaces.persona.model.Delegacion;
import mx.gob.imss.dpes.interfaces.persona.model.DelegacionPersonalEF;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author eduardo.loyo
 */
@Data
public class PersonaP extends BaseModel {

    @Getter @Setter private  Long id;
    @Getter @Setter private  Long estadoPersonaEf;
    @Getter @Setter private  EstadoPersonaEf cveEstadoPersonaEf;
    @Getter @Setter private  Short cveSexo;
    @Getter @Setter private  Long cveEntidadFinanciera;
    @Getter @Setter private  Long cvePersonalEf;
    @Getter @Setter private  Long cveEstadoVital;
    @Getter @Setter private  Long cveTipoEmpleado;
    @Getter @Setter private  Long cveEntidadFederativa;
    @Getter @Setter private  Long cveTipoPersonaEntidadFinanciera;
    @Getter @Setter private  String cveRefDomicilio;
    @Getter @Setter private  String nombre;
    @Getter @Setter private  String primerApellido;
    @Getter @Setter private  String segundoApellido;
    @Getter @Setter private  String numEmpleado;
    @Getter @Setter private  String numNss;
    @Getter @Setter private  String cveCurp;
    @Getter @Setter private  String usuario;
    @Getter @Setter private  String passwordUsu;
    @Getter @Setter private  String rfc;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private  Date fecNacimiento;
    @Getter @Setter private  String registroPatronal;
    @Getter @Setter private  String telLocal;
    @Getter @Setter private  String telCelular;
    @Getter @Setter private  String indPassword;
    @Getter @Setter private  String fecRegistroAlta;
    @Getter @Setter private  String fecRegistroBaja;
    @Getter @Setter private  String fecRegistroActualizado;
    @Getter @Setter private  String correoElectronico;
    @Getter @Setter private  Domicilio domicilio = new Domicilio();
    @Getter @Setter private  Long baja;
    @Getter @Setter private  Long cvePerfil;
    @Getter @Setter private  Documento ife;
    @Getter @Setter private  Documento documentoIdentOficial;
    @Getter @Setter private  Documento cartaResponsiva;
    @Getter @Setter private  Documento fotografia;
    @Getter @Setter private  Documento comprobanteDomicilio;
    @Getter @Setter private  List<DelegacionPersonalEF> delegaciones;
    @Getter @Setter private  List<Delegacion> lstDelegaciones;
    @Getter @Setter private String imgB64;
    @Getter @Setter private Long firmaCartaRecibo;
}

