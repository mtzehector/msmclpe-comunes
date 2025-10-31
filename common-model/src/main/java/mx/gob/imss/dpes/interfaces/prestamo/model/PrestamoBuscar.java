package mx.gob.imss.dpes.interfaces.prestamo.model;


import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PrestamoBuscar extends BaseModel {

    @Getter
    @Setter
    private BigDecimal ID;
    @Getter
    @Setter
    private String NUMEROFOLIO;
    @Getter
    @Setter
    private String CURP;
    @Getter
    @Setter
    private String NSS;
    @Getter
    @Setter
    private String NOMBRE;
    @Getter
    @Setter
    private String PRIMERAPELLIDO;
    @Getter
    @Setter
    private String SEGUNDOAPELLIDO;
    @Getter
    @Setter
    private String CVEDELEGACION;
    @Getter
    @Setter
    private String DELEGACION;
    @Getter
    @Setter
    private String GRUPOFAMILIAR;
    @Getter
    @Setter
    private BigDecimal CVEORIGENSOLICITUD;
    @Getter
    @Setter
    private Date FECHAINICIOFOLIO;
    @Getter
    @Setter
    private BigDecimal CVETIPOCREDITO;
    @Getter
    @Setter
    private String TIPOCREDITO;
    @Getter
    @Setter
    private BigDecimal CVEENTIDADFINANCIERA;
    @Getter
    @Setter
    private String ENTIDADFINANCIERA;
    @Getter
    @Setter
    private BigDecimal CAT;
    @Getter
    @Setter
    private BigDecimal CVEPROMOTOR;
    @Getter
    @Setter
    private String PROMOTOR;
    @Getter
    @Setter
    private BigDecimal MONTOSOLICITADO;
    @Getter
    @Setter
    private BigDecimal DESCUENTONOMINA;
    @Getter
    @Setter
    private BigDecimal PLAZO;
    @Getter
    @Setter
    private BigDecimal TOTALPAGAR;
    @Getter
    @Setter
    private Date VIGENCIAFOLIO;
    @Getter
    @Setter
    private BigDecimal CVEESTADO;
    @Getter
    @Setter
    private String ESTADO;
    @Getter
    @Setter
    private String SUBDELEGACION;
    @Getter
    @Setter
    private String REFTRABAJADOR;
    @Getter
    @Setter
    private BigDecimal CVEENTIDADFEDERATIVA;
    @Getter
    @Setter
    private BigDecimal INDSIPRESTATUS;
    @Getter
    @Setter
    private Date FECSIPREMODIFICA;
    @Getter
    @Setter
    private String CVEENTIDADFINMEJOROFERTA;
    @Getter
    @Setter
    private String PENSIONADOCORREO;
    @Getter
    @Setter
    private BigDecimal IDPRESTAMO;
    @Getter
    @Setter
    private Date FECPRIMERDESCUENTO;
    @Getter
    @Setter
    private Date FECALTAPRESTAMO;
    @Getter
    @Setter
    private BigDecimal CVECONDICIONOFERTA;
    @Getter
    @Setter
    private BigDecimal CVETIPOSIMULACION;
    @Getter
    @Setter
    private String REFCUENTACLABE;
}
