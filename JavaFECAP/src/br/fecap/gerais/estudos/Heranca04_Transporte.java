package br.fecap.gerais.estudos;

public abstract class Heranca04_Transporte {
	
	protected String modelo;
	protected double capacidade; // Número de pessoas ou capacidade em kg.
	
	// Construtor
	
	public Heranca04_Transporte(String modelo, double capacidade) {
		this.modelo = modelo;
		this.capacidade = capacidade;
	}
	
	// Método abstrato
	
	abstract double calcularCustoViagem(double distancia);
	
	// Método de impressão
	
	public String getDescricao() {
		return "\nModelo: " + modelo + " | Capacidade: " + capacidade;
	}

}