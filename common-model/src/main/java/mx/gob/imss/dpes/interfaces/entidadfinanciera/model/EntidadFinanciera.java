/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author Diego Velazquez
 */
public class EntidadFinanciera extends BaseModel {

    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    String nombreComercial;
    @Getter
    @Setter
    String razonSocial;
    @Getter
    @Setter
    String rfc;
    @Getter
    @Setter
    String numTelefono;
    @Getter
    @Setter
    String paginaWeb;
    @Getter
    @Setter
    String correoElectronico;
    @Getter
    @Setter
    String correoAdminEF;
    @Getter
    @Setter
    Double catPromedio;
    @Getter
    @Setter
    String idSipre;
    @Getter
    @Setter
    String telefonoAtencionClientes;
    @Getter
    @Setter
    private String imgB64;
    @Getter
    @Setter
    String cveEntidadFinancieraSipre;
    @Getter
    @Setter
    Long numProveedor;
    @Getter
    @Setter
    String clabe;

}
