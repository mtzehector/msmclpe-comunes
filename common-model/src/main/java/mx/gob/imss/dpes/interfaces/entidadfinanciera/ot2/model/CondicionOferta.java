package mx.gob.imss.dpes.interfaces.entidadfinanciera.ot2.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.gob.imss.dpes.common.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = true)
public class CondicionOferta extends BaseModel {

	private static final long serialVersionUID = 1L;

	private Long id;
	private BigDecimal porTasaAnual;
	private BigDecimal porCat;
	private Plazo mclcPlazo;
	private List<Beneficio> mclcBeneficioCollection = new ArrayList<Beneficio>();
	private Date fecRegistroAlta;
}