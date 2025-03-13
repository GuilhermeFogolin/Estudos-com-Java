package curso_java_programacao;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class JAVA_SEQUENCIAL_RETANGULO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Digite a base do retangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("Area = " + String.format("%.4f", area));
		System.out.println("Perimetro = " + String.format("%.4f", perimetro));
		System.out.println("Diagonal = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
