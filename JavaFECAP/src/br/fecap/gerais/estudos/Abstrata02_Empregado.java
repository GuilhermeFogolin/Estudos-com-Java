package br.fecap.gerais.estudos;

public class Abstrata02_Empregado {

	private String nome; 
	private String CPF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public Abstrata02_Empregado() {}

	public Abstrata02_Empregado(String n, String c) {
		this.nome = n;
		this.CPF = c;
	}
	
	public float calculaSalario() {
		return 0.0f;
	}
}