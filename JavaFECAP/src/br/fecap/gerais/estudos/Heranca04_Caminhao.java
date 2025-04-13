package br.fecap.gerais.estudos;

public class Heranca04_Caminhao extends Heranca04_Transporte {

	protected double custoPorKm;
	
	// Construtor
	
	public Heranca04_Caminhao(String modelo, double capacidade, double custoPorKm) {
		super(modelo, capacidade);
		this.custoPorKm = custoPorKm;
	}
	
	// Método
	
	@Override
	public double calcularCustoViagem(double distancia) {
		return distancia * custoPorKm;
	}
}
