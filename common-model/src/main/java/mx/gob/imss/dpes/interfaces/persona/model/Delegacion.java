/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.persona.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class Delegacion extends BaseModel {

    @Getter
    @Setter
    private Long cveDelegacion;
    @Getter
    @Setter
    private String desDelegacion;
    @Getter
    @Setter
    private String numDelegacion;

    @Getter
    @Setter
    private String descDelegacion;
}
