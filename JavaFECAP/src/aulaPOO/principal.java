package aulaPOO;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		
		String nome = sc.next();
		
		System.out.println("O seu nome é " + nome);
		
		
		System.out.print("Qual a sua idade? ");
		
		int idade = sc.nextInt();
		
		System.out.printf("Você tem %d anos!", idade);
		
		sc.close();
		
	}

}
