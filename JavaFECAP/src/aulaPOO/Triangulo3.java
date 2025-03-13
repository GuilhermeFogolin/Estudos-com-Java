package aulaPOO;

public class Triangulo3 {
	
	float base;
	float altura;
	
	public Triangulo3() {}
	
	public Triangulo3(float b, float a) {
		this.base = b;
		this.altura = a;
	}
	
	public float calcularArea() {
		return (base * altura) / 2;
	}
	
	public String imprimirDados() { 
		return "Base: " + base + ", Altura: " + altura + ", Área: " + calcularArea();
	}
}
