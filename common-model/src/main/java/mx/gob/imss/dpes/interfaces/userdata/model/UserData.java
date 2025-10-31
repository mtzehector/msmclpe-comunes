/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.userdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author gabriel.rios
 */
public class UserData extends BaseModel{
    
    @JsonProperty("cvePerfil")
    @Getter @Setter private BigDecimal CVE_PERFIL;
    @JsonProperty("desPerfil")
    @Getter @Setter private String DES_PERFIL;
    @JsonProperty("firmaCartaRecibo")
    @Getter @Setter private BigDecimal FIRMA_CARTA_RECIBO;
    @JsonProperty("nombre")
    @Getter @Setter private String NOMBRE;
    @JsonProperty("numNss")
    @Getter @Setter private String NUM_NSS;
    @JsonProperty("telefonoCelular")
    @Getter @Setter private BigDecimal TEL_CELULAR;
    @JsonProperty("primerApellido")
    @Getter @Setter private String PRIMER_APELLIDO;
    @JsonProperty("segundoApellido")
    @Getter @Setter private String SEGUNDO_APELLIDO;
    @JsonProperty("cveCurp")
    @Getter @Setter private String CVE_CURP;
    @JsonProperty("nomUsuario")
    @Getter @Setter private String NOM_USUARIO;
    @JsonProperty("matriculaTrabIMSS")
    @Getter @Setter private String MATRICULA_TRABAJADOR_IMSS;
    @JsonProperty("desDelegacionTrabIMSS")
    @Getter @Setter private String DELEGACION_TRABAJADOR_IMSS;
    @JsonProperty("telefonoLocal")
    @Getter @Setter private BigDecimal TEL_LOCAL;
    @JsonProperty("fecNacimiento")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter @Setter private Date FEC_NACIMIENTO;

    @Getter
    @Setter
    private String RFC;


}
