package aulaPOO;

public class TesteTriangulo {

	public static void main(String[] args) {
		
		// Primeiro
		
		Triangulo2 tri = new Triangulo2();
		
		tri.altura = 15.6;
		
		tri.base = 25.6;
		
		System.out.print("A área do triângulo vale " + (tri.altura * tri.base) + " unidades quadradas!");
		
		// Segundo
		
		Triangulo2 tri2 = new Triangulo2(45.6, 78.9);
		
		System.out.print("\n\nA área do triângulo vale " + (tri2.altura * tri2.base) + " unidades quadradas!");
		
	}

}
