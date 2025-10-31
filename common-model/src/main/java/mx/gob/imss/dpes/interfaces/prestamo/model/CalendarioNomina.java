/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.prestamo.model;

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
public class CalendarioNomina extends BaseModel {

    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date altaRegistro;
    @Getter
    @Setter
    Integer numPeriodoNomina;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date fecInicioCaptura;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date fecDescuento;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date fecFinCaptura;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date fecInicioEjecucion;
    @Getter
    @Setter
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    Date fecFinEjecucion;

    public CalendarioNomina() {
    }

    @Override
    public String toString() {
        return "CalendarioNomina{" + "id=" + id + ", altaRegistro=" + altaRegistro + ", numPeriodoNomina=" + numPeriodoNomina + ", fecInicioCaptura=" + fecInicioCaptura + ", fecDescuento=" + fecDescuento + ", fecFinCaptura=" + fecFinCaptura + ", fecInicioEjecucion=" + fecInicioEjecucion + ", fecFinEjecucion=" + fecFinEjecucion + '}';
    }

}
