package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;


import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.CartaReciboFirmada;
import mx.gob.imss.dpes.interfaces.bitacora.model.DocumentoConciliacionRequest;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConciliacionRequest extends BaseModel {

    public ConciliacionRequest() {
    }

    public ConciliacionRequest(Long cveEntidadFinanciera, String periodo) {
        this.cveEntidadFinanciera = cveEntidadFinanciera;
        this.periodo = periodo;
    }

    @Getter
    @Setter
    private Long cveEntidadFinanciera;

    @Getter
    @Setter
    private String razonSocial;

    @Getter
    @Setter
    private Integer numeroProveedor;

    @Getter
    @Setter
    private String nombreRespresentante;
    
    @Getter
    @Setter
    private String nombreComercial;
    
    @Getter
    @Setter
    private String rfc;

    @Getter
    @Setter
    private String periodo;

    @Getter
    @Setter
    private String curp;

    @Getter
    @Setter
    private String firma;

    @Getter
    @Setter
    private Documento documento = new Documento();

    @Getter
    @Setter
    private Long cveTipoDocumento;

    @Getter
    @Setter
    private Boolean estatusPeriodo;

    @Getter
    @Setter
    private byte[] archivo;

    @Getter
    @Setter
    private RespuestaBoveda respuestaBoveda = new RespuestaBoveda();

    @Getter
    @Setter
    private List<CartaReciboFirmada> listCartaReciboConFirma;

    @Getter
    @Setter
    private Long[] arregloIdEntidadFinanciera;

    @Getter
    @Setter
    private String[] arregloEntidadFinancieraSipre;

    @Getter
    @Setter
    private List<Long> filtroEF;
    
    @Getter
    @Setter
    private List<ReporteEFPorCuentaContable> listEntidades;

    @Getter
    @Setter
    private List<Documento> listDocumentos = new ArrayList<>();

    @Getter
    @Setter
    private String cveEntidadFinancieraSipre;

    @Getter
    @Setter
    private Boolean erogacion;

    @Getter
    @Setter
    private List<Documento> listSolicitudTransferencia = new ArrayList<>();

    @Getter
    @Setter
    private List<Documento> listCuentaContable = new ArrayList<>();

    @Getter
    @Setter
    private List<Documento> listRetencionPorDelegacion = new ArrayList<>();

    @Getter
    @Setter
    private BigDecimal iva;

    @Getter
    @Setter
    private Integer entidadesSinDocumento = 0;

    @Getter
    @Setter
    private Long cvePerfil;

    @Getter
    @Setter
    private List<DocumentoConciliacionRequest> listCartaRecibo = new ArrayList<>();

    @Getter
    @Setter
    private String firmaTitular;

    @Getter
    @Setter
    private String titularImss;
    
    @Getter
    @Setter
    private String operadorEF;
    
    @Getter
    @Setter
    private String firmaOperadorEF;
    
    @Getter
    @Setter
    private String firmaAdministradorEF;

    @Getter
    @Setter
    private Long sesion;

}
