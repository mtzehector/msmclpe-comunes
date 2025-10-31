/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sistrap.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class AltModEntFinancierasRequest  extends BaseModel{
    @Getter @Setter private String   idMovimiento;
    @Getter @Setter private String   entidadPago;
    @Getter @Setter private String   cveRfc;
    @Getter @Setter private String   desRazonSocialInst;
    @Getter @Setter private String   numProveedor;
    @Getter @Setter private String   catPromedio;
    @Getter @Setter private String   desRegistroPatronal;
    @Getter @Setter private String   domFiscal;
    @Getter @Setter private String   fecFirmaConvenio;
    @Getter @Setter private String   fecInicioConvenio;
    @Getter @Setter private String   numClabe;
    @Getter @Setter private String   numCuenta;
    @Getter @Setter private String   nomEmail;
    @Getter @Setter private String   nomRepLegal;
    @Getter @Setter private String   fecAltaInst;
    @Getter @Setter private String   estatusLog;
    @Getter @Setter private String   idLogin;
    @Getter @Setter private String   fecModificacion;
    @Getter @Setter private String   fecFinConvenio;
    @Getter @Setter private String   razonSocial;
    @Getter @Setter private String   numTel;
    @Getter @Setter private String   desUrlContacto;
    @Getter @Setter private String   nomComercial;

}
