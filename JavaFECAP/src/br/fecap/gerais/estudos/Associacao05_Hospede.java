package br.fecap.gerais.estudos;

public class Associacao05_Hospede {
	
	// Atributos
	
	private String nome;
	private String cpf;
	
	// Métodos de acesso
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCpf() { return cpf; }
	
	public void setCpf(String cpf) { this.cpf = cpf; }
	
	// Construtor
	
	public Associacao05_Hospede(String nome, String cpf) {
		this.nome = nome;
		this.cpf= cpf;
	}
	
	// Método para imprimir informações
	
	public void getDescricao() {
		System.out.print("\nNome: " + getNome() + "\nCPF: " + getCpf());
	}
}