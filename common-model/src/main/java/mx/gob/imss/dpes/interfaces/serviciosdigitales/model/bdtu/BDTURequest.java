/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model.bdtu;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.Persona;
import mx.gob.imss.dpes.interfaces.userdata.model.UserData;

/**
 *
 * @author eduardo.montesh
 */

@Data
public class BDTURequest extends BaseModel {
    @Getter @Setter BDTURequestIn bdtuIn;
    @Getter @Setter BDTURequestOut bdtuOut;
    @Getter @Setter UserData userData;

    public BDTURequest(BDTURequestIn bdtuIn, BDTURequestOut bdtuOut) {
        this.bdtuIn = bdtuIn;
        this.bdtuOut = bdtuOut;
    }

    public BDTURequest() {
    }
    
}
