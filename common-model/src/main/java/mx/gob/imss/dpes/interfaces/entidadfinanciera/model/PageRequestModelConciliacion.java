package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.PageModel;
import mx.gob.imss.dpes.common.model.PageRequestModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.CartaReciboFirmada;
import mx.gob.imss.dpes.interfaces.bitacora.model.DocumentoConciliacionRequest;

public class PageRequestModelConciliacion extends BaseModel {

    @Getter
    @Setter
    private PageRequestModel<ConciliacionRequest> request;

    @Getter
    @Setter
    private PageModel<CartaReciboFirmada> response;

    @Getter
    @Setter
    private PageModel<DocumentoConciliacionRequest> responsePageModelCartaRecibo;



}
