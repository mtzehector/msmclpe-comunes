/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sistrap.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author antonio
 */
public class ConsultaPensionesResponse extends SistrapResponse {

    @Getter
    @Setter
    private List<Pension> pensiones = new ArrayList<>();
}
