package br.fecap.gerais.estudos;

import java.util.Scanner;

public class FuncaoMaiorNumero {

	public static int maior(int num1, int num2) {
		
		 if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		

		 System.out.printf("\nComparando %d e %d o maior número é: %d.", num1, num2, maior(num1, num2));
		
		sc.close();

	}

}
