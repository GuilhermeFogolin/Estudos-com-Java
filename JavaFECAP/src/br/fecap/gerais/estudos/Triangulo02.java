package br.fecap.gerais.estudos;

public class Triangulo02 {

	float base;
	float altura;
	
	public Triangulo02() {}
	
	public Triangulo02(float b, float a) {
		this.base = b;
		this.altura = a;
	}
	
	public float calcularArea() {
		return (base * altura) / 2;
	}
	
	public String imprimeDados() {
		return "\nBase = " + base + "\nAltura = " + altura + "\nÁrea = " + calcularArea() + " unidades quadradas";
	}
}
