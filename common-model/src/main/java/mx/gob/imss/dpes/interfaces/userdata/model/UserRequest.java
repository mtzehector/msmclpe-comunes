/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.userdata.model;

import lombok.Data;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author gabriel.rios
 */
@Data
public class UserRequest extends BaseModel{
    
    private String userName;
    private String curp;
    private String nss;
    private Long sesion;
}
