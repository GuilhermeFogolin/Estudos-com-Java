package br.fecap.gerais.estudos;

public class Associacao07_Terceiro extends Associacao07_Funcionario {

	// Atributos
	
	private double horas;

	private double valorHora;
	
	// Métodos de acesso
	
	public double getHoras() {
		return horas;
	}
	
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// Construtor
	
	public Associacao07_Terceiro(String nome, int matricula, double horas, double valorHora) {
		super(nome, matricula);
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	// Método para calcular o salário
	
	@Override
	public double calcularSalario() {
		return horas * valorHora;
	}
	
	// Métodos para imprimir o crachá
	
	@Override
	public void imprimirCracha() {
		System.out.print("\nNome: " + super.getNome()
		+ "\nMatrícula: " + super.getMatricula());
	}
}
