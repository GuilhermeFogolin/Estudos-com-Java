package br.fecap.gerais.estudos;

import java.util.Scanner;

public class MenuDeOperacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		double dif = 0;
		double prod = 0;
		
		System.out.println("1 - Média entre os dois números"
				+ "\n2 - Diferença dos númerosr"
				+ "\n3 - O produto entre os dois números");
		
		System.out.print("Qual opção você precisa: ");
		String opc = sc.next();
		
		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		switch(opc) {
		
		case "1":
			media = (num1 + num2) / 2;
			System.out.printf("\nA média de %.2f com %.2f vale %.2f.", num1, num2, media);
			break;
				
		case "2":
			dif = num1 - num2;
			System.out.printf("\nA diferença de %.2f com %.2f vale %.2f.", num1, num2, dif);
			break;
			
		case "3":
			prod = num1 * num2;
			System.out.printf("\nO produto de %.2f com %.2f vale %.2f.", num1, num2, prod);
			break;
			
		default:
			System.out.print("\nNão há essa opção no menu! Tente novamente.");
		}

		sc.close();

	}

}