package aulaPOO;

public class Carro {
	
	String marca;
	String modelo;
	int ano;
	
	public Carro() { // Construtor tem o mesmo nome da classe!
		modelo = "desconhecido";
	}
	
	public Carro(String marca, int ano) { // Variável recebe.
		this.marca = marca;
		this.ano = ano;
	}

	public Carro(int ano, String modelo) {
		this.modelo = modelo;
		this.ano = ano;
	}
 
}