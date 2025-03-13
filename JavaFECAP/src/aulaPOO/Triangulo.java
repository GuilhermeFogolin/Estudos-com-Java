package aulaPOO;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura;
		
		// Base
		System.out.print("Qual o valor da base? ");
		base = sc.nextDouble();
		
		// Altura
		System.out.print("Qual o valor da altura? ");
		altura = sc.nextDouble();
		
		// Área
		double area = (base * altura) / 2;
		
		System.out.printf("O valor da área é %.2f unidades quadradas.", area);
		
		sc.close();

	}

}
