package aulaPOO.ClasseAbstrata;

public class Quadrado extends Forma {
	
	private float base;
	
	// Construtor
	
	public Quadrado(float b) {
		base = b;
	}

	// Método de acesso
	
	public void setBase(float b) {
		base = b;
	}
	
	public float getBase() {
		return base;
	}
	
	// Sobreposição do método da classe Pessoa
	
	public float perimetro() {
		return base * 4;
	}

	// Implementação dos métodos abstratos da classe Forma
	
	public float area() {
		return base * base;
	}
	
	public void mostra() {
		System.out.println("Base: " + base + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}

}