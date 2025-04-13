package br.fecap.gerais.estudos;

public class Heranca03_Funcionario_Diretor extends Heranca03_Funcionario{

	// Atributos
	
	protected double percentualLucros;
	private double lucroEmpresa;
	
	// Construtor
	
	public Heranca03_Funcionario_Diretor(String nome, double salarioBase, double percentualLucros) {
		super(nome, salarioBase);
		this.percentualLucros = percentualLucros;
	}
	
	// Métodos
	
	public void setLucroEmpresa(double lucro) {
		this.lucroEmpresa = lucro;
	}
	
	@Override
	public double calcularSalarioFinal() {
		return salarioBase + (lucroEmpresa * percentualLucros);
	}	
}