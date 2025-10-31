/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.entidadfinanciera.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author Diego Velazquez
 */
public class Oferta extends BaseModel {
   
   @Getter @Setter private Long id;
   @Getter @Setter private EntidadFinanciera entidadFinanciera = new EntidadFinanciera();
   @Getter @Setter private Double monto;
   @Getter @Setter private Double cat;
   @Getter @Setter private Double descuentoMensual;
   @Getter @Setter private Plazo plazo = new Plazo();   
   @Getter @Setter private Double importeTotal;
   @Getter @Setter private Double tasaAnual;
   @Getter @Setter private List<Beneficio> beneficios = new ArrayList<>(); 
}
