package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CONDICIONAL_CRESCENTE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite dois números: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		while(n1 != n2)
		{
			if(n1 > n2)
			{
				System.out.println("Ordem decrescente!");
			}
			
			else
			{
				System.out.println("Ordem crescente!");
			}
			
			System.out.println("Digite outros dois números: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();

	}

}
