package br.fecap.gerais.estudos;

public class Interface02_Triangulo extends Interface02_Forma implements Interface02_Desenhavel {
	
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

	public Interface02_Triangulo(float b, float h) {
		this.base = b;
		this.altura = h;
	}
	

	@Override
	public float area() {
		return (base * altura) / 2;
	}
	
	@Override
	public float perimetro() {
		return base * 3;
	}
	
	@Override
	public void mostra() {
		System.out.printf("\nBase: %.2f"
				+ "\nÁrea: %.2f"
				+ "\nPerímetro: %.2f", base, area(), perimetro());
	}
	
	@Override
	public void desenhar() {
		System.out.print("\nSeu triângulo se desenha com três linhas!");
	}
}