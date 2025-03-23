package br.fecap.gerais.estudos;

import java.util.Scanner;

public class TabuadaComWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
		int cont = 1;
		
		System.out.print("Qual o número? ");
		num = sc.nextDouble();
		
		while(cont <= 10) {
			System.out.println(num + " X " + cont + " = " + (num * cont));
			cont += 1;
		}
		
		sc.close();
		

	}

}
