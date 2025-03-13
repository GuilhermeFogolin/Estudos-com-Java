package aulaPOO;

import java.util.Scanner;

public class CondicionalEncadeada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		int idade = sc.nextInt();
		
		// Condicionais
		if(idade < 16) {
			System.out.printf("Você tem %d e, portanto, não pode votar!", idade);
		} else if(idade >= 18 && idade < 65) {
			System.out.printf("Você tem %d e, portanto, o seu voto é obrigatório!", idade);
		} else if(idade >=16 && idade <18 || idade >= 65) {
			System.out.printf("Você tem %d e, portanto, o seu voto é facultativo!", idade);
		}
		
		sc.close();
	}
}
