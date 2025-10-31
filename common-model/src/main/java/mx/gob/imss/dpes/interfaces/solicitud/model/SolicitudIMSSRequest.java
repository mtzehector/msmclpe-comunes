/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.solicitud.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;

/**
 *
 * @author eduardo.loyo
 */
public class SolicitudIMSSRequest extends IdentityBaseModel<Long> {

    @Getter @Setter String nss;
    @Getter @Setter String folio;
    
}
