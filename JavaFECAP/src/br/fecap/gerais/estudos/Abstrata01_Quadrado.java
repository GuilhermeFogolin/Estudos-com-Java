package br.fecap.gerais.estudos;

public class Abstrata01_Quadrado extends Abstrata01_Forma{

	private float lado;
	
	public Abstrata01_Quadrado(float l) {
		this.lado = l;
	}
	
	public float getBase() {
		return lado;
	}
	
	public void setBase(float l) {
		this.lado = l;
	}
	
	// Sobreposição do método da classe Forma
	
	@Override
	public float area() {
		return lado * lado;
	}
	
	@Override
	public float perimetro() {
		return lado * 4;
	}
	
	@Override
	public void mostra() {
		System.out.printf("\nBase: %.2f"
				+ "\nÁrea: %.2f unidades quadradas"
				+ "\nPerímetro: %.2f unidades", lado, area(), perimetro());
	}
}
