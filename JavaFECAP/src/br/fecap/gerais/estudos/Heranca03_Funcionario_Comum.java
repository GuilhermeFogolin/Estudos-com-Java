package br.fecap.gerais.estudos;

public class Heranca03_Funcionario_Comum extends Heranca03_Funcionario {

	// Construtor
	
	public Heranca03_Funcionario_Comum(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	// Método
	
	@Override
	public double calcularSalarioFinal() {
		return salarioBase;
	}
}

