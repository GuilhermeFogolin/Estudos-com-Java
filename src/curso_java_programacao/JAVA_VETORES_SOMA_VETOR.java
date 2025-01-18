package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_VETORES_SOMA_VETOR {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("\nVALORES = ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(String.format("%.1f", vet[i]) + "  ");
		}
		
		double soma = 0;
		for(int i = 0; i < n; i++)
		{
			soma = soma + vet[i];
		}
		System.out.print("\nSOMA = " + String.format("%.2f", soma));
		
		double media = soma / n;
		System.out.print("\nMEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}