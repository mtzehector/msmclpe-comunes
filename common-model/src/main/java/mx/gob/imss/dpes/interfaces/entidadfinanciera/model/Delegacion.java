/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author gabriel.rios
 */
@Data
public class Delegacion extends BaseModel {
    
    @JsonProperty("cveDelegacion") @Getter @Setter private BigDecimal CVE_DELEGACION;
    @JsonProperty("descDelegacion") @Getter @Setter private String DES_DELEGACION;
    
    
}
