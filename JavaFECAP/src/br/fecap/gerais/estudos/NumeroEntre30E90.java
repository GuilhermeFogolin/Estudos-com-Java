package br.fecap.gerais.estudos;

import java.util.Scanner;

public class NumeroEntre30E90 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		int contNum = 0;
		
		while(cont <= 10) {
			System.out.print("\nDigite o " + cont + "° número: ");
			double num = sc.nextDouble();
			
			if(num > 30 && num < 90) {
				System.out.printf("\nO número %.2f está entre 30 e 90.\n", num);
				contNum += 1;
			}
			
			cont += 1;
		}
		
		System.out.printf("\nO total de número de 30 e 90 é: %d", contNum);
		
		sc.close();

	}

}
