package br.fecap.gerais.estudos;

public abstract class Associacao07_Funcionario implements Associacao07_Impressao {

	// Atributos
	
	private String nome;

	private int matricula;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	// Construtor
	
	public Associacao07_Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public abstract double calcularSalario();
}
