package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.PageModel;
import mx.gob.imss.dpes.common.model.PageRequestModel;

public class PageRequestModelTramiteErogacion extends BaseModel {

    @Getter
    @Setter
    private PageRequestModel<ConciliacionRequest> request;

    @Getter
    @Setter
    private PageModel<TramiteErogacionConciliacion> response;
}
