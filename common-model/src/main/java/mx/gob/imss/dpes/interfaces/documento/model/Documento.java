package mx.gob.imss.dpes.interfaces.documento.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.TipoDocumentoEnum;
import mx.gob.imss.dpes.common.model.LogicDeletedModel;

import java.util.Objects;

/**
 * 
 * @author juan.garfias
 */
public class Documento extends LogicDeletedModel<Long> {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Long cveSolicitud;
    @Getter
    @Setter
    private TipoDocumentoFront tipoDocumentoEnum;
    @Getter
    @Setter
    private TipoDocumentoEnum tipoDocumento;
    @Getter
    @Setter
    private String refSello;
    @Getter
    @Setter
    private String refDocBoveda;
    @Getter
    @Setter
    private String refDocumento;
    @Getter
    @Setter
    private String refDocumentoClob;
    @Getter
    @Setter
    private String cadenaOriginal;
    @Getter
    @Setter
    private String sello;
    @Getter
    @Setter
    private String noSerie;
    @Getter
    @Setter
    private String idSello;
    @Getter
    @Setter
    private String descTipoDocumento;
    @Getter
    @Setter
    private Long cvePersona;
    @Getter
    @Setter
    private Long cveEntidadFinanciera;
    @Getter
    @Setter
    private Long cvePrestamoRecuperacion;
    @Getter
    @Setter
    private String folioSIPRE;
    @Getter
    @Setter
    private String numEntidadFinancieraSIPRE;
    @Getter
    @Setter
    private byte[] archivo;
    @Getter
    @Setter
    private byte[] archivoBase64;
    @Getter
    @Setter
    private String nombreDocNotificacion;
    @Getter
    @Setter
    private boolean indDocumentoHistorico;
    @Getter
    @Setter
    private String eFinanciera;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        boolean td = false;
        if (tipoDocumento != null && documento.tipoDocumento != null)
            td = tipoDocumento.getTipo().equals(documento.tipoDocumento.getTipo());

        return Objects.equals(id, documento.id) && td && Objects.equals(refDocBoveda, documento.refDocBoveda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoDocumento, refDocBoveda);
    }
}
