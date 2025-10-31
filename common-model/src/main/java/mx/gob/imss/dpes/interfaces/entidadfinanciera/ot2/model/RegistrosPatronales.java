/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.gob.imss.dpes.interfaces.entidadfinanciera.ot2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.interfaces.documento.model.Documento;
/**
 *
 * @author juanf.barragan
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class RegistrosPatronales extends BaseModel{

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long idEntidadFinanciera;
    private String registroPatronal;
    private Date fecRegistroAlta;

}
