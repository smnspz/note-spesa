package it.jac.mvc.dto;

public class VoceSpesaDTO {
	
	private int id;
	private String commento;
	private double importo;
	private int idNotaSpesa;
	private int idCategoria;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public int getIdNotaSpesa() {
		return idNotaSpesa;
	}
	public void setIdNotaSpesa(int idNotaSpesa) {
		this.idNotaSpesa = idNotaSpesa;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
