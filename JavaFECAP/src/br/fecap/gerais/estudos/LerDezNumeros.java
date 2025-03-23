package br.fecap.gerais.estudos;

import java.util.Scanner;

public class LerDezNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num = 0;
		
		double soma = 0;
		
		int cont = 1;
		
		while(cont <= 10) {
			System.out.print("Digite o " + cont + "° número: ");
			num = sc.nextDouble();
			
			soma += num;
			
			cont += 1;
		}
		
		System.out.printf("\nO total da soma vale %.2f.", soma);

	}

}