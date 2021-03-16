package it.jac.mvc.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Provider
public class GenericExceptionHandler extends Throwable implements ExceptionMapper<Throwable> {
	
	private static final long serialVersionUID = 1L;
	
	private Logger log = LogManager.getLogger(GenericExceptionHandler.class);

	@Override
	public Response toResponse(Throwable exception) {
		
		log.error("Errore generico", exception);
		return Response.status(500).entity("Errore inaspettato. Contattare l'amministratore").type("text/plain")
				.build();
	}
}
