package aulaPOO;

import java.util.Scanner;

public class CondicionalEncadeada2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		int idade = sc.nextInt();
		
		if(idade <= 12) {
			System.out.printf("Você tem %d anos, ou seja, é uma criança!", idade);
		} else if (idade <= 17) {
			System.out.printf("Você tem %d anos, ou seja, é um adolescente!", idade);
		} else if (idade <= 64) {
			System.out.printf("Você tem %d anos, ou seja, é um adulto!", idade);
		} else {
			System.out.printf("Você tem %d anos, ou seja, é um idoso!", idade);
		}
		
		sc.close();
	}
}