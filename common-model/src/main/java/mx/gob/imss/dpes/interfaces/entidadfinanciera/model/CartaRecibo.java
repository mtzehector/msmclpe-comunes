package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;

public class CartaRecibo extends BaseModel {

    @Getter
    @Setter
    private BigDecimal PAGOTOTALPRIMAS;

    @Getter
    @Setter
    private BigDecimal TASACOSTOADMIN;

    @Getter
    @Setter
    private BigDecimal IVACOSTOADMIN;

    //@Getter
    //@Setter
    //private BigDecimal TASAPERMISOACCESOITINERANTE;

    //@Getter
    //@Setter
    //private BigDecimal IVAPERMISOITINERANTE;

    @Getter
    @Setter
    private BigDecimal IMPORTEPAGADODEFUNCIONES;
    
    @Getter
    @Setter
    private BigDecimal IVA;
    
    @Getter
    @Setter
    private BigDecimal PORCENTAJEADMINISTRACION;
    
    @Getter
    @Setter
    private BigDecimal PORCENTAJEPERMISOITINERANTE;

}
