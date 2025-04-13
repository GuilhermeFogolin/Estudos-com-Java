package br.fecap.gerais.estudos;

public class Heranca03_Funcionario_Gerente extends Heranca03_Funcionario {

	// Atributo
	
	protected double bonusMensal;
	
	// Construtor
	
	public Heranca03_Funcionario_Gerente(String nome, double salarioBase, double bonusMensal) {
		super(nome, salarioBase);
		this.bonusMensal = bonusMensal;
	}
	
	// Método
	
	@Override
	public double calcularSalarioFinal() {
		return salarioBase + bonusMensal;
	}
	
	
}
