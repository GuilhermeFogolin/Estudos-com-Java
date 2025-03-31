package br.fecap.gerais.estudos;

public class Abstrata01_Triangulo extends Abstrata01_Forma {

	private float base;
	private float altura;
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Abstrata01_Triangulo(float b, float h) {
		this.base = b;
		this.altura = h;
	}
	
	@Override
	public float area() {
		return (base * altura) / 2;
	}
	
	@Override
	public void mostra() {
		System.out.printf("\nBase: %.2f"
				+ "\nAltura: %.2f"
				+ "\nÁrea: %.2f unidades quadradas", base, altura, area());
	}
	
}