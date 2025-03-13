package curso_java_programacao;

import java.util.Scanner;

public class JAVA_VETORES_MAIS_VELHO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, i, maisVelha, pos;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nomeVet = new String[n];
		int[] idadeVet = new int[n];
		
		for(i = 0; i < n; i++)
		{
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nomeVet[i] = sc.nextLine();
			System.out.print("Idade: ");
			idadeVet[i] = sc.nextInt();	
		}
		
		maisVelha = idadeVet[0];
		pos = 0;
		
		for(i = 1; i < n; i++)
		{
			if(idadeVet[i] > maisVelha)
			{
				maisVelha = idadeVet[i];
				pos = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nomeVet[pos]);
		
		sc.close();
	}
}