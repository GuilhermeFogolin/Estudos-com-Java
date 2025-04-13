package br.fecap.gerais.estudos;

public class Heranca04_Carro extends Heranca04_Transporte {
	
	protected double consumoCombustivel; // Em km/L
	protected double precoCombustivel;
	
	// Construtor
	
	public Heranca04_Carro(String modelo, double capacidade, double consumoCombustivel, double precoCombustivel) {
		super(modelo, capacidade);
		this.consumoCombustivel = consumoCombustivel;
		this.precoCombustivel = precoCombustivel;
	}
	
	// Método
	
	@Override
	public double calcularCustoViagem(double distancia) {
		return (distancia / consumoCombustivel) * precoCombustivel;
	}

}
