package mx.gob.imss.dpes.interfaces.entidadfinanciera.ot2.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class CondicionEntidadFederativa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long cveDelegacion;
        private Long cveEntidadFederativa;
	private Long numEdadLimite;
	private BigDecimal monMinimo;
	private BigDecimal monMaximo;
	private Sexo mclcSexo;
}
