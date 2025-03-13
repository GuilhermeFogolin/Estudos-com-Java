package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_SEQUENCIAL_TERRENO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area, preco;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valor;
		
		System.out.println("\nArea do terreno = " + String.format("%.2f", area) + " metros quadrados");
		System.out.println("Preco do terreno = R$" + String.format("%.2f", preco));
		
		sc.close();

	}

}
