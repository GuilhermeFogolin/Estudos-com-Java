package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CONDICIONAL_MENOR_DE_TRES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, menor;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		n3 = sc.nextInt();
		
		if(n1 < n2 && n1 < n3)
		{
			menor = n1;
		}
		
		else if(n2 < n3)
		{
			menor = n2;
		}
		
		else
		{
			menor = n3;
		}
		
		System.out.print("\nMENOR = " + menor);
		
		sc.close();

	}

}
