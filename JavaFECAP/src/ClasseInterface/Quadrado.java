package ClasseInterface;

public class Quadrado extends Forma implements Desenhavel {

	// Atributo
	
	private float base;

	// Interface
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	public Quadrado(float b) {
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
	public void mostrar() {
		System.out.println("\nBase: " + base + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}
	
	// Interface
	
	@Override
	public void desenhar() {
		System.out.println("Desenho do quadrado com " + area() + " área quadradas!\n");
	}
}
