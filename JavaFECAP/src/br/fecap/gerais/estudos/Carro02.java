package br.fecap.gerais.estudos;

public class Carro02 {

	String marca;
	int ano;
	String modelo;
	float valorFipe;
	
	public Carro02() {
		modelo = "Não fornecido ainda.";
	}
	
	public Carro02(String marca) {
		this.marca = marca;
	}
	
	public Carro02(String m, float v) {
		this.marca = m;
		this.valorFipe = v;
	}
	
	public float calcularValorVenda(float v) {
		return v * 1.25f;
	}
	
	public void imprimeDados() {
		System.out.printf("\nMarca: %s"
				+ "\nAno: %d"
				+ "\nModelo: %s"
				+ "\nValor da tabela Fipe: R$%.2f", marca, ano, modelo, valorFipe);
	}
}
