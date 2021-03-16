package it.jac.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.jac.mvc.entity.Dipendente;
import it.jac.mvc.entity.VoceSpesa;
import it.jac.mvc.exception.DatabaseException;

public class GestionaleDAO extends BaseDao {
	
	private static final Logger log = LogManager.getLogger(GestionaleDAO.class);
	
	private static final GestionaleDAO instance = new GestionaleDAO();

	private GestionaleDAO() {}
	
	public static GestionaleDAO getInstance() {
		return instance;
	}
	
	public void salvaNuovoDipendente(Dipendente entity) {
		
		try (Connection conn = getConnection()) {
			
			log.debug("Salvo del db");

			StringBuilder sb = new StringBuilder();
			
			sb.append(" INSERT INTO dipendente");
			sb.append(" (matricola, nome, cognome, id_societa, data_nascita, utente_creazione)");
			sb.append(" VALUES");
			sb.append(" (?, ?, ?, ?, ?, ?)");
			
			PreparedStatement pstm = conn.prepareStatement(sb.toString());
			
			pstm.setString(1, entity.getMatricola());
			pstm.setString(2, entity.getNome());
			pstm.setString(3, entity.getCognome());
			pstm.setInt(4, entity.getIdSocieta());
			pstm.setDate(5, entity.getDataNascita());
			pstm.setString(6, entity.getCreationUser());

			pstm.executeUpdate();
			
		} catch (SQLException e) {
			
			log.error("Errore durante il salvataggion delle info nel db", e);
			throw new DatabaseException("Errore durante il salvataggion delle info ne db", e);
		}
		
	}
	
	public void salvaNuovaVoceSpesa(VoceSpesa entity) {
		
		try (Connection conn = getConnection()) {
			
			log.debug("Salvo del db");

			StringBuilder sb = new StringBuilder();
			
			sb.append(" INSERT INTO voce_spesa");
			sb.append(" (commento, importo, id_nota_spesa, id_categoria, utente_creazione)");
			sb.append(" VALUES");
			sb.append(" (?, ?, ?, ?, ?)");
			
			PreparedStatement pstm = conn.prepareStatement(sb.toString());
			
			pstm.setString(1, entity.getCommento());
			pstm.setDouble(2, entity.getImporto());
			pstm.setInt(3, entity.getIdNotaSpesa());
			pstm.setInt(4, entity.getIdCategoria());
			pstm.setString(5, entity.getCreationUser());

			pstm.executeUpdate();
			
		} catch (SQLException e) {
			
			log.error("Errore durante il salvataggion delle info nel db", e);
			throw new DatabaseException("Errore durante il salvataggion delle info ne db", e);
		}
	}

}
