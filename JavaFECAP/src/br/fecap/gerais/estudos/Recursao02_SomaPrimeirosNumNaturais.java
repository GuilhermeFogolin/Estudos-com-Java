package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Recursao02_SomaPrimeirosNumNaturais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual número você deseja somar seus antecessores naturais? ");
		int n = sc.nextInt();
		
		System.out.printf("A soma dos antecessores de %d vale: %d!", n, somaPrimeirosNumNaturais(n));
		
		sc.close();

	}
	
	public static int somaPrimeirosNumNaturais(int n) {
		
		if(n == 1) {
			return 1;
		} else {
			return somaPrimeirosNumNaturais(n - 1) + n;
		}
		
	}
}
