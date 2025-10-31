/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.interfaces.sistrap.model.SistrapResponse;

/**
 *
 * @author antonio
 */
public class ConsultaDescuentoEmitidoResponse extends SistrapResponse{ 
  @Getter @Setter private List<DescuentoEmitido> descuentosEmitidos;
  @Getter @Setter private List<DescuentoEmitido> descuentosVoList;
  @Getter @Setter private List<DescuentoEmitido> prestamosEnCursoVoList;

    public ConsultaDescuentoEmitidoResponse() {
    }

    public ConsultaDescuentoEmitidoResponse(List<DescuentoEmitido> descuentosEmitidos) {
        this.descuentosEmitidos = descuentosEmitidos;
    }

    public ConsultaDescuentoEmitidoResponse(List<DescuentoEmitido> descuentosEmitidos, List<DescuentoEmitido> descuentosVoList, List<DescuentoEmitido> prestamosEnCursoVoList) {
        this.descuentosEmitidos = descuentosEmitidos;
        this.descuentosVoList = descuentosVoList;
        this.prestamosEnCursoVoList = prestamosEnCursoVoList;
    }
  
}
