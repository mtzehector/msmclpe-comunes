/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.renapo.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author eduardo.loyo
 */
public class RenapoCurpIn extends BaseModel {

    public RenapoCurpIn() {
    }

    public RenapoCurpIn(String curp) {
        this.curp = curp;
    }

    @Getter
    @Setter
    private String curp;

}
