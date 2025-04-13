package br.fecap.gerais.estudos;

public class Heranca03_Funcionario_Diretor extends Heranca03_Funcionario{

	// Atributos
	
	protected double percentualLucros;
	
	// Construtor
	
	public Heranca03_Funcionario_Diretor(String nome, double salarioBase, double percentualLucros) {
		super(nome, salarioBase);
		this.percentualLucros = percentualLucros;
	}
	
	// Métodos
	
	public double setLucroEmpresa(double lucro) {
		return lucro;
	}
	
	@Override
	public double calcularSalarioFinal() {
		return salarioBase + (setLucroEmpresa(0) * percentualLucros);
	}	
}