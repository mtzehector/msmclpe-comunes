package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

public class SolicitudTransferencia extends BaseModel {

    @Getter
    @Setter
    private Double retencionNacional;

    @Getter
    @Setter
    private Double costoAdministrativo;

    @Getter
    @Setter
    private Double ivaCostoAdministrativo;

    //@Getter
    //@Setter
    //private Double permisoItinerante;

    //@Getter
    //@Setter
    //private Double ivaPermisoItinerante;

    @Getter
    @Setter
    private Double importeFallecidos;

    @Getter
    @Setter
    private Double netoPagar;

}
