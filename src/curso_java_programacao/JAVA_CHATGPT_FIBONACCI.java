package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CHATGPT_FIBONACCI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, proximo, anterior = 1, antesAnterior = 0;
		
		System.out.print("Quantos termos quer da sequência? ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{ 
			System.out.println(antesAnterior + " ");
			proximo = anterior + antesAnterior;
			antesAnterior = anterior;
			anterior = proximo;
		}
	}
}
