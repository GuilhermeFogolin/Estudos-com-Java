package br.fecap.gerais.estudos;

import java.util.Scanner;

public class FuncaoDivisivel {

	 static boolean divisivel(int num1, int num2) {
	
		 return num1 % num2 == 0 || num2 % num1 == 0;
	}
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		if(divisivel(num1, num2)) {
			System.out.printf("Os números %d e %d são divisíveis.", num1, num2);
		} else {
			System.out.printf("Os números %d e %d não são divisíveis.", num1, num2);
		}
		
		sc.close();
	}

}
