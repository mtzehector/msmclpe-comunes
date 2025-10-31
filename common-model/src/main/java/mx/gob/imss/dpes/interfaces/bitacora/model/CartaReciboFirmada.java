package mx.gob.imss.dpes.interfaces.bitacora.model;


import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;


import java.util.Date;

public class CartaReciboFirmada extends BaseModel {

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private String nombreComercial;

    @Getter
    @Setter
    private Integer estadoEntidadFinanciera;

    @Getter
    @Setter
    private Long cveDocumentoConciliacion;

    @Getter
    @Setter
    private Documento documento;

    @Getter
    @Setter
    private String periodo;

    @Getter
    @Setter
    private Date fechaDescarga;

    @Getter
    @Setter
    private Date fechaFirma;

    @Getter
    @Setter
    private Boolean erogacion;


}
