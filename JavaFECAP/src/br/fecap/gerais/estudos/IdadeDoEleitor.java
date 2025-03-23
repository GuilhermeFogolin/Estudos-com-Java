package br.fecap.gerais.estudos;

import java.util.Scanner;

public class IdadeDoEleitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.printf("Você tem %d anos e não pode voltar.", idade);
		} else if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.printf("Você tem %d anos e seu voto é facultativo.", idade);
		} else if (idade >= 18 || idade < 65) {
			System.out.printf("Você tem %d anos e seu voto é obrigatório.", idade);
		} 
		
		sc.close();

	}

}