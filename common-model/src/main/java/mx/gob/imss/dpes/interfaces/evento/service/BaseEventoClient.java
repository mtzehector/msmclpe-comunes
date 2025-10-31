/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.evento.service;

import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.interfaces.evento.model.Evento;

public interface BaseEventoClient {
    public Response create(Evento evento);    
}
