package curso_java_programacao;

import java.util.Scanner;

public class JAVA_REPETITIVA_EXPERIENCIAS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, total, rato = 0, sapo = 0, coelho = 0, quantidade = 0;
		double pRato, pSapo, pCoelho;
		char tipo, R, S, C;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++)
		{
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			if(tipo == 'R' || tipo == 'r')
			{
				rato = rato + quantidade;
			}
			
			else
			{
				if(tipo == 'S' || tipo == 's')
				{
					sapo = sapo + quantidade;
				}
				
				else
				{
					coelho = coelho + quantidade;
				}
			}
		}

		total = rato + sapo + coelho;
		pRato = (double) (100 * rato) / total;
		pSapo = (double) (100 * sapo) / total;
		pCoelho = (double) (100 * coelho) / total;
		
		System.out.println("\nRELATÓRIO FINAL: ");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", pCoelho) + "%");
		System.out.println("Percentual de ratos: " + String.format("%.2f", pRato) + "%");
		System.out.println("Percentual de sapos: " + String.format("%.2f", pSapo) + "%");

		sc.close();
	}
}
