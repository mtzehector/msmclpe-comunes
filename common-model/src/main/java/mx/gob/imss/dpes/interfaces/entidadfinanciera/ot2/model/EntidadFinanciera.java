package mx.gob.imss.dpes.interfaces.entidadfinanciera.ot2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.bitacora.model.DocumentoEFPS;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.PrestadorServiciosEF;

@Data
@EqualsAndHashCode(callSuper = true)
public class EntidadFinanciera extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String rfc;
	private String razonSocial;
	private String nombreComercial;
	private String registroPatronal;
	private String curpRepresentanteLegal;
	private String nombreLegal;
	private String primerApeLegal;
	private String segundoApeLegal;
	private String curpAdmin;
	private String nombreAdmin;
	private String primerApAdmin;
	private String segundoApeAdmin;
	private String correoAdmin;
	private String numeroTelefono;
	private String telefonoAtencionClientes;
	private String paginaWeb;
	private String correoElectronico;
	private String correo2;
	private String correo3;
	private String direccion;
	private Date fecFirmaContra;
	private Date fecIniFirmaContra;
	private String numeroProveedor;
	private String clabe;
	private String instBancaria;
	private String descBanco;
	private EstadoEntidad mclcEstadoEf;
	private List<CondicionOferta> mclcCondicionOfertaCollection = new ArrayList<CondicionOferta>();
	private List<CondicionEntidadFederativa> mclcCondicionEntfedCollection = new ArrayList<CondicionEntidadFederativa>();
	private Documento logo;
	private Long sinConvenio;
	private List<RegistrosPatronales> mcltRegistrosPatronalesCollection = new ArrayList<RegistrosPatronales>();
	private PrestadorServiciosEF prestadorServicioCertificado;
	private PrestadorServiciosEF prestadorServicioValidacionBiometrica;
	private List<DocumentoEFPS> documentosPSCertificado= new ArrayList<DocumentoEFPS>();
	private List<DocumentoEFPS> documentosPSValidacionBiometrica= new ArrayList<DocumentoEFPS>();
	private boolean existeDocPSCertificado;
	private boolean existeDocPSValidacionBiometrica;
	private String adminRFC;

}
