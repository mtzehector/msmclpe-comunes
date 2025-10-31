package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.util.Objects;

public class RetencionPorDelegacion extends BaseModel {

    @Getter
    @Setter
    private String numeroDelegacion;

    @Getter
    @Setter
    private String delegacion;

    @Getter
    @Setter
    private Integer total;

    @Getter
    @Setter
    private Double netoPagar;

    @Getter
    @Setter
    private Integer numeroProveedor;

    @Getter
    @Setter
    private String nombreComercial;


}
