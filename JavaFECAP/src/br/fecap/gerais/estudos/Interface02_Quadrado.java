package br.fecap.gerais.estudos;

public class Interface02_Quadrado extends Interface02_Forma implements Interface02_Desenhavel {

	private float base;
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	public Interface02_Quadrado(float b) {
		this.base = b;
	}
	
	@Override
	public float area() {
		return base * base;
	}
	
	@Override
	public float perimetro() {
		return base * 4; 
	}
	
	@Override 
	public void mostra() {
		System.out.printf("Base: %.2f"
				+ "\nÁrea: %.2f"
				+ "\nPerímetro: %.2f", base, area(), perimetro());
	}
	
	@Override
	public void desenhar() {
		System.out.print("\nSeu quadrado se desenha com quatro linhas!");
	}
}
