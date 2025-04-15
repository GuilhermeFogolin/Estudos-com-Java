package br.fecap.gerais.estudos;

public class Associacao07_Efetivo extends Associacao07_Funcionario {

	// Atributo
	
	private double salarioMensal;
	
	// Métodos de acesso
	
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	// Construtor
	
	public Associacao07_Efetivo(String nome, int matricula, double salarioMensal) {
		super(nome, matricula);
		this.salarioMensal = salarioMensal;
	}
	
	// Método para calcular o salário
	
	@Override
	public double calcularSalario() {
		return salarioMensal;
	}
	
	// Métodos para imprimir o crachá
	
	@Override
	public void imprimirCracha() {
		System.out.print("\nNome: " + super.getNome()
		+ "\nMatrícula: " + super.getMatricula());
	}
}