package br.fecap.gerais.estudos;

public class Heranca02_Pessoa {

	private String nome;
	private String fone;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public Heranca02_Pessoa() {}
	
	public Heranca02_Pessoa(String n, String f) {
		this.nome = n;
		this.fone = f;
	}

	public void imprimir() {
		System.out.printf("\nNome: %s"
				+ "\nTelefone: %s", nome, fone);
	}
}