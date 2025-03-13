package curso_java_programacao;

import java.util.Scanner;

public class JAVA_REPETITIVA_SOMA_IMPARES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite dois números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2)
		{
			int troca = n2;
			n2 = n1;
			n1 = troca;
		}
		
		for(int i = n1 + 1; i < n2; i++)
		{
			if(i % 2 != 0)
			{
				soma = soma + i;
			}
		}
		
		System.out.print("\nSOMA DOS IMPARES = " + soma);
		
		sc.close();
		

	}

}
