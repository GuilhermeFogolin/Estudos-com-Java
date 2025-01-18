package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CHATGPT_FATORIAL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, fatorial = 1;
		
		System.out.print("Digite um número inteiro positivo: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 1; i--)
		{
			fatorial = fatorial * i;
		}
		
		System.out.print("O fatorial de " + n + " é " + fatorial);
		
		sc.close();

	}

}
