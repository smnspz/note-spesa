package it.jac.mvc.dto;

import java.sql.Date;

public class DipendenteDTO {

	private int id;
	private String matricola;
	private String nome;
	private String cognome;
	private int idSocieta;
	private Date dataNascita;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getIdSocieta() {
		return idSocieta;
	}
	public void setIdSocieta(int idSocieta) {
		this.idSocieta = idSocieta;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
}
