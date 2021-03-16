package it.jac.mvc;

import java.sql.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.media.multipart.FormDataParam;

import it.jac.mvc.service.GestionaleService;

@Path("/gestionale")
public class GestionaleRestApi {

	private Logger log = LogManager.getLogger(GestionaleRestApi.class);
	
	private GestionaleService service = new GestionaleService();
	
	@POST
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@Path("/{idSocieta}/dipendente")
	public Response addDipendente(@PathParam("idSocieta") int idSocieta,
			@FormDataParam("matricola") String matricola,
			@FormDataParam("nome") String nome,
			@FormDataParam("cognome") String cognome,
			@FormDataParam("dataNascita") Date dataNascita) {

		try {
			service.aggiungiDipendente(idSocieta, matricola, nome, cognome, dataNascita);
		} catch (Exception e) {
			
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
		
		return Response.status(Status.CREATED).build();
	}
	
	@POST
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@Path("/{idNotaSpesa}/voce-spesa")
	public Response addVoceSpesa(@PathParam("idNotaSpesa") int idNotaSpesa,
			@FormDataParam("idCategoria") int categoria,
			@FormDataParam("commento") String commento,
			@FormDataParam("importo") double importo) {

		try {
			service.aggiungiVoceSpesa(idNotaSpesa, categoria, commento, importo);
		} catch (Exception e) {
			
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
		
		return Response.status(Status.CREATED).build();
	}
	
	
}
