package mx.gob.imss.dpes.interfaces.entidadfinanciera.ot2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.gob.imss.dpes.common.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = true)
public class Plazo extends BaseModel {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descripcion;
}