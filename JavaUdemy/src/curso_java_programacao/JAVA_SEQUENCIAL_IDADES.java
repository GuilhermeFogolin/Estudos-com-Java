package curso_java_programacao;

import java.util.Scanner;

public class JAVA_SEQUENCIAL_IDADES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (double) (idade1 + idade2) / 2;
		
		System.out.print("A idade média de " + nome1 + " e " + nome2 + " e de " + media + " anos.");
		
		sc.close();

	}

}
