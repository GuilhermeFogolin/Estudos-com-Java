package aulaPOO.ClasseAbstrata;

public class Triangulo extends Forma {
	
	// Atributos
	
	private float base, altura;
	
	// Construtor
	
	public Triangulo(float b, float h) {
		base = b;
		altura = h;
	}
	
	// Métodos de acesso

	public float getBase() {
		return base;
	}

	public void setBase(float b) {
		this.base = b;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float h) {
		this.altura = h;
	}
	
	// Implementação dos métodos abstratos da classe Forma
	
	public float area() {
		return (base * altura) / 2;
	}
	
	public void mostra() {
		System.out.println("Base: " + base + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}

}
