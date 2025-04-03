package br.fecap.gerais.estudos;

public class Associacao01_Endereco {

	private String rua;
	private String cidade;
	private String estado;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Associacao01_Endereco(String rua, String cidade, String estado) {
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void mostrarInfo() {
		System.out.printf("\nRua: %s"
				+ "\nCidade: %s"
				+ "\nEstado: %s", rua, cidade, estado);
	}

}
