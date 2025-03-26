package br.fecap.gerais.estudos;

public class Celular {
	
	String marca;
	String modelo;
	String so;
	
	public void ligar() {
		System.out.println("\nLigado!");
	}
	
	public void desligar() {
		System.out.println("\nDesligado!");
	}
	
	public void Mensagem(String msg) {
		System.out.println(msg);
	}

}