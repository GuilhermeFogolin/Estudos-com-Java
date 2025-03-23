package EstudosGerais;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		double base = sc.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A área vale %.2f unidades quadradas.", area);
		
		sc.close();
		
		
	}

}
