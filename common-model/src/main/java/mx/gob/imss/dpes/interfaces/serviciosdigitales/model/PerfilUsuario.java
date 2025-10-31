/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.serviciosdigitales.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.serviciosdigitales.model.bdtu.Sexo;

@Data
public class PerfilUsuario extends BaseModel {

	 private Long id;
	 private Long idUsuario;
	 private Long idPerfil;
	 private Long firmaCartaRecibo;

}
