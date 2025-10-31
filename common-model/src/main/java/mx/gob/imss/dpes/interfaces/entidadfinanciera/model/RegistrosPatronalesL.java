/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juanf.barragan
 */
@Data
public class RegistrosPatronalesL extends BaseModel{
    
    @Getter @Setter private List<String> registros;
    @Getter @Setter private String cveEF;
}
