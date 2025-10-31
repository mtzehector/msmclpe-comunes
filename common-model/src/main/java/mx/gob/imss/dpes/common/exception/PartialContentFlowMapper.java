package mx.gob.imss.dpes.common.exception;

import mx.gob.imss.dpes.common.model.ErrorInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class PartialContentFlowMapper
     implements ExceptionMapper<PartialContentFlowException> {

   @Override
   public Response toResponse(PartialContentFlowException e) {
     ErrorInfo error = new ErrorInfo();
     error.setMessage(e.getMessage());
     error.setError( true );
     return Response.status(Response.Status.PARTIAL_CONTENT).entity(error).build();
   }
}