/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.persona.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.support.config.CustomDateDeserializer;
import mx.gob.imss.dpes.support.config.CustomDateSerializer;

/**
 *
 * @author juan.garfias
 */
public class PersonaPensionado extends BaseModel {

    @Getter
    @Setter
    String nombre;
    @Getter
    @Setter
    String primerApellido;
    @Getter
    @Setter
    String segundoApellido;
    @Getter
    @Setter
    Integer cveSexo;
    @Getter
    @Setter
    String cveCurp;
    @Getter
    @Setter
    String numNss;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    @Getter
    @Setter
    Date fecNacimiento;
}
