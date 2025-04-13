package br.fecap.gerais.estudos;

	abstract class Heranca03_Funcionario {
	
	// Atributos
	
	protected String nome;
	protected double salarioBase;
	
	// Construtor
	
	public Heranca03_Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	// Métodos
	
	public abstract double calcularSalarioFinal();
	
	public String getDescricao() {
		return "Funcionário: " + nome + " | Salário base: R$" + salarioBase;
	}
	
}