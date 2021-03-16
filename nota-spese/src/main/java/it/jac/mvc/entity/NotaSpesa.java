package it.jac.mvc.entity;

public class NotaSpesa extends IdentityKeyEntity {

	private String cod;
	private String meseRiferimento;
	private double importoTotale;
	private String stato;
	private int idDipendente;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getMeseRiferimento() {
		return meseRiferimento;
	}
	public void setMeseRiferimento(String meseRiferimento) {
		this.meseRiferimento = meseRiferimento;
	}
	public double getImportoTotale() {
		return importoTotale;
	}
	public void setImportoTotale(double importoTotale) {
		this.importoTotale = importoTotale;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public int getIdDipendente() {
		return idDipendente;
	}
	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}
}
