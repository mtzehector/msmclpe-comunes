/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.relacionlaboral.model;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author eduardo.loyo
 */
@Data
public class RelacionLaboralOut extends BaseModel {
   @Getter @Setter private List<InfoCIRelacionLaboral> listInfoRelacionesLaborales;
   @Getter @Setter private String code;
   @Getter @Setter private String message;
   @Getter @Setter private String registroPatronalActual;
}
