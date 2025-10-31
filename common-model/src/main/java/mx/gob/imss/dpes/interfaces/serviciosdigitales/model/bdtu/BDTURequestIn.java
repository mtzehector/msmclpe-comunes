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

/**
 *
 * @author eduardo.montesh
 */
@Data
public class BDTURequestIn extends BaseModel {
    @Getter @Setter private String curp;
    @Getter @Setter private String nss;

    public BDTURequestIn() {
    }

    public BDTURequestIn(String curp, String nss) {
        this.curp = curp;
        this.nss = nss;
    }
    
}
