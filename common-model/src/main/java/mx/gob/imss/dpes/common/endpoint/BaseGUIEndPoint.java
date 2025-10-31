/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.endpoint;

import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import mx.gob.imss.dpes.common.constants.Constantes;
import mx.gob.imss.dpes.common.exception.*;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.Notice;

/**
 *
 * @author antonio
 * @param <C> Dominio a crear
 * @param <L> Dominio a utilizar para filtrar
 * @param <U> Dominio utilizado para actualizar
 */
public abstract class BaseGUIEndPoint<C extends BaseModel,L extends BaseModel,U extends BaseModel> {

  @Inject
  BusinessMapper businessMapper;
  
  @Inject
  AlternateFlowMapper alternateFlowMapper;

  @Inject
  PartialContentFlowMapper partialContentFlowMapper;
  
  public Response create(C input) throws BusinessException, AlternateFlowException{ return Response.noContent().build(); }
  public Response load(L input) throws BusinessException, AlternateFlowException{ return Response.noContent().build(); }
  public Response loadBovedaV3(L input) throws BusinessException, AlternateFlowException{ return Response.noContent().build(); }
  public Response update(U input) throws BusinessException, AlternateFlowException{ return Response.noContent().build(); }
  
  protected final Logger log = Logger.getLogger( getClass().getName() );
  
  protected Response toResponse(Message message){
    
    switch( message.getHeader().getStatus() ){
    
      case EXCEPCION:
        return businessMapper.toResponse( message.getHeader().getException() );
      case ALTERNO:     
        return alternateFlowMapper.toResponse((AlternateFlowException) message.getHeader().getException());
      case PARTIAL_CONTENT:
        return partialContentFlowMapper.toResponse((PartialContentFlowException) message.getHeader().getException());
      default:
        String notices = "";
        if( !message.getHeader().getNotices().isEmpty() ){
          StringBuilder sb = new StringBuilder();
          for( Notice not : message.getHeader().getNotices() ){
            sb.append( not.getMessageKey() );
          }
          notices = sb.toString();
        }
        
        return Response.ok(message.getPayload()).header("app-notice", notices).build();
    }
  }

  protected String obtenerTokenSeguridad(MultivaluedMap<String, String> headers) throws BusinessException {
    if (!(headers != null && !headers.isEmpty()))
      return null;

    List<String> entry = headers.containsKey(Constantes.HEADER_AUTHORIZATION) ?  headers.get(Constantes.HEADER_AUTHORIZATION) : null;
    if(entry != null && entry.size() == 1 && entry.get(0).contains(Constantes.BEARER))
      return entry.get(0).replace(Constantes.BEARER, Constantes.CADENA_VACIA).trim();

    throw new RequestTokenException(RequestTokenException.ERROR_EN_RECUPERACION_TOKEN);
  }
}
