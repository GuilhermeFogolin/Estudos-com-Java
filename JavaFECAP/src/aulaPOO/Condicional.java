package aulaPOO;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		
		// Idade
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.printf("Você tem %d anos, portanto é maior de idade.", idade);
		} else {
			System.out.printf("Você tem %d anos, portanto é menor de idade.", idade);
		}
		
		// Nome
		System.out.print("\nDigite o seu nome: ");
		
		String nome = sc.next();
		
		if(nome.equals("Guilherme")) {
			System.out.print("Seu nome é Guilherme.");
		} else {
			System.out.print("Você não é o Guilherme.");
		}
		sc.close();

	}
}
