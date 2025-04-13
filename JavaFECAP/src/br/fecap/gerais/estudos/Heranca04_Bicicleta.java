package br.fecap.gerais.estudos;

public class Heranca04_Bicicleta extends Heranca04_Transporte {
	
	// Construtor
	
	public Heranca04_Bicicleta(String modelo, double capacidade) {
		super(modelo, capacidade);
	}
	
	// Método
	
	@Override
	public double calcularCustoViagem(double distancia) {
		return 0;
	}
	
	// Impressão
	
	@Override 
	public String getDescricao() {
		return "\nModelo: " + modelo + "\nCapacidade: " + capacidade + "\nNão há custos! É um transporte ecológico.";
	}

}