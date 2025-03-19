package ClasseInterface;

import java.util.Scanner;

public class TesteClasseInterface {

	public static void main(String[] args) {
		
		float baseTeste, alturaTeste;
		
		Scanner sc = new Scanner(System.in);
		
		// Quadrado
		
		System.out.print("Digite a base do quadrado: ");
		baseTeste = sc.nextFloat();
		
		Quadrado qua = new Quadrado(baseTeste);
		
		qua.mostrar();
		qua.desenhar();
		
		// Triângulo
		
		System.out.print("Digite a base do triângulo: ");
		baseTeste = sc.nextFloat();
		
		System.out.print("Digite a altura do triângulo: ");
		alturaTeste = sc.nextFloat();
		
		Triangulo tri = new Triangulo(baseTeste, alturaTeste);
		
		tri.mostrar();
		tri.desenhar();
		
		// Scanner
		
		sc.close();

	}

}
