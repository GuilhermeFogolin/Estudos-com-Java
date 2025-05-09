package aulaPOO.exHeranca;

public class Pessoa {

	private String nome;
	private String fone;
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getFone() { return fone; }
	
	public void setFone(String fone) { this.fone = fone; }
	
	public Pessoa() {}
	
	public Pessoa(String nome, String fone) {
		this.nome = nome;
		this.fone = fone;
	}
	
	public void imprimir() {
		System.out.println("\nNome: " + nome + 
				"\nFone: " + fone);
	}
	
}