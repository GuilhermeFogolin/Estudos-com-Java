package aulaPOO;

public class Carro2 {

	String marca;
	int ano;
	String modelo;
	double valorFipe;
	
	public Carro2() {
		valorFipe = 0;
	}
	
	public Carro2(String marca) {
		this.marca = marca;
	}
	
	public Carro2(String marca, double valorFipe) {
		this.marca = marca;
		this.valorFipe = valorFipe;
	}
	
	public void imprimirDados() {
		System.out.println("\nMarca do carro: " + marca + ".");
		System.out.println("Ano do carro: " + ano + ".");
		System.out.println("Modelo do carro: " + modelo + ".");
		System.out.println("Valor da tabela fipe do carro: R$" + valorFipe + ".");
	}
	
	public double calcularValorVenda(double valor) {
		return valor * 1.25;
	}
 }
