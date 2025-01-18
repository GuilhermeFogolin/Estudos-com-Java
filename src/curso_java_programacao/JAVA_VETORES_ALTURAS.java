package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_VETORES_ALTURAS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, cont;
		double media, soma, pMenor;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nomeVet = new String[n];
		int[] idadeVet = new int[n];
		double[] alturaVet = new double[n];
		
		for(i = 0; i < n; i++)
		{
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nomeVet[i] = sc.nextLine();
			System.out.print("Idade: ");
			idadeVet[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturaVet[i] = sc.nextDouble();
		}
		
		soma = 0;
		for(i = 0; i < n; i++)
		{
			soma = soma + alturaVet[i];
		}
		media = soma / n;
		System.out.println("\nAltura média: " + String.format("%.2f", media) + " metros");
		
		cont = 0;
		for(i = 0; i < n; i++)
		{
			if(idadeVet[i] < 16)
			{
				cont = cont + 1;
			}
		}
		pMenor = (double) (cont * 100) / n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", pMenor) + "%");
		
		for(i = 0; i < n; i++)
		{
			if(idadeVet[i] < 16)
			{
				System.out.println(nomeVet[i]);
			}
		}
		
		sc.close();
	}
}
