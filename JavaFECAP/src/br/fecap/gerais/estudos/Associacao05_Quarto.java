package br.fecap.gerais.estudos;

public class Associacao05_Quarto {
	
	// Atributos
	
	private int numero;
	private String tipo;
	private double precoPorNoite;	
	
	// Métodos de acesso
	
	public int getNumero() { return numero; }
	
	public void setNumero(int numero) { this.numero = numero; }
	
	public String getTipo() { return tipo; }
	
	public void setTipo(String tipo) { this.tipo = tipo; }
	
	public double getPrecoPorNoite() { return precoPorNoite; }
	
	public void setPrecoPorNoite(double precoPorNoite) { this.precoPorNoite = precoPorNoite; }
	
	// Construtor
	
	public Associacao05_Quarto(int numero, String tipo, double precoPorNoite) {
		this.numero = numero;
		this.tipo = tipo;
		this.precoPorNoite = precoPorNoite;
	}
	
	
	// Método para imprimir informações
	
	public void getDescricao() {
		System.out.print("\nNúmero: " + getNumero() + "\nTipo: " + getTipo() + "\nPreço por noite: R$" + getPrecoPorNoite());
	}
	
}