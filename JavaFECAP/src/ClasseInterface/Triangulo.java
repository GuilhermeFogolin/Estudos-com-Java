package ClasseInterface;

public class Triangulo extends Forma implements Desenhavel {

	private float base;
	private float altura;
	
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
	
	public Triangulo(float b, float h) {
		this.base = b; // Opcional colocar o this!
		this.altura = h;
	}
	
	@Override
	public float area() {
		return (base * altura) / 2;
	}
	
	@Override
	public float perimetro() { // Simulação de que é equilátero
		return base * 3;
	}
	
	@Override
	public void mostrar() {
		System.out.println("\nBase: " + base + "\nAltura: " + altura + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}
	
	// Interface
	
	@Override
	public void desenhar() {
		System.out.println("Desenho do triângulo com " + area() + " área quadradas!");
	}
	
}