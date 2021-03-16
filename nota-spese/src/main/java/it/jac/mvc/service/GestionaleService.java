package it.jac.mvc.service;

import java.sql.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.jac.mvc.dao.GestionaleDAO;
import it.jac.mvc.entity.Dipendente;
import it.jac.mvc.entity.VoceSpesa;

public class GestionaleService {

	private static Logger log = LogManager.getLogger(GestionaleService.class);

	private GestionaleDAO dao = GestionaleDAO.getInstance();

	public void aggiungiDipendente(int idSocieta, String matricola, String nome, String cognome, Date dataNascita) {

		try {
			log.debug("Aggiungo informazioni all'entity");
			Dipendente entity = new Dipendente();
			entity.setMatricola(matricola);
			entity.setIdSocieta(idSocieta);
			entity.setNome(nome);
			entity.setCognome(cognome);
			entity.setDataNascita(dataNascita);
			entity.setCreationUser("admin");
			
			dao.salvaNuovoDipendente(entity);
		} catch (Exception e) {
			log.error("Errore durante l'aggiunga delle informazioni all'entity", e);
		}
	}
	
	public void aggiungiVoceSpesa(int idNotaSpesa, int idCategoria, String commento, double importo) {
		
		try {
			log.debug("Aggiungo informazioni all'entity");
			VoceSpesa entity = new VoceSpesa();
			entity.setIdNotaSpesa(idNotaSpesa);
			entity.setIdCategoria(idCategoria);
			entity.setCommento(commento);
			entity.setImporto(importo);
			entity.setCreationUser("admin");
			
			dao.salvaNuovaVoceSpesa(entity);
		} catch (Exception e) {
			log.error("Errore durante l'aggiunta delle informazioni all'entity", e);
		}
	}
}
