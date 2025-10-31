/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import mx.gob.imss.dpes.common.model.ErrorInfo;

/**
 *
 * @author antonio
 */
@Provider
public class BusinessMapper
     implements ExceptionMapper<BusinessException> {

   @Override
   public Response toResponse(BusinessException e) {
     ErrorInfo error = new ErrorInfo();
     error.setMessage(e.getMessage());
     error.setError( true );
     return Response.status(Response.Status.NOT_ACCEPTABLE).entity(error).build();
   }
}