/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author antonio
 */
public class IdentityBaseModel<I extends Serializable> extends BaseModel {

  @Getter @Setter private I id;

}
