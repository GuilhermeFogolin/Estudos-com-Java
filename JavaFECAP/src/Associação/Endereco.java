package Associação;

public class Endereco extends Pessoa {
	
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
	
	public Endereco() {
		// VER NOS SLIDES O QUE PODE ESTAR ERRADO!
	}

	public void mostrarInfo() {
		System.out.println("Rua: " + rua + "\nCidade: " + cidade + "\nEstado: " + estado);
	}

}
