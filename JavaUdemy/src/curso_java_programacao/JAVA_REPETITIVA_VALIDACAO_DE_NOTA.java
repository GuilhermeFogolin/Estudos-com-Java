package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_REPETITIVA_VALIDACAO_DE_NOTA {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		while(nota1 < 0 || nota1 > 10)
		{
			System.out.print("Valor inválido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		while(nota2 < 0 || nota2 > 10)
		{
			System.out.print("Valor inválido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2;
		
		System.out.print("MÉDIA = " + String.format("%.2f", media));
	}

}
