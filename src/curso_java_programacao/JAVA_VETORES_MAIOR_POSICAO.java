package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_VETORES_MAIOR_POSICAO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, pos;
		double maior, troca;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i = 0; i < n; i++)
		{
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		maior = vet[0];
		pos = 0;
		for(i = 1; i < n; i++)
		{
			if(vet[i] > maior) 
			{
				troca = maior; 
				maior = vet[i]; 
				vet[i] = troca; 
				
				pos = i;
			}
		}

		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + pos);
		
		sc.close();
	}
}
