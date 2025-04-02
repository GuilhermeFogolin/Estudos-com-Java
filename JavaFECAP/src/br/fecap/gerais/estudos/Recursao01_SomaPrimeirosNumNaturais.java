package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Recursao01_SomaPrimeirosNumNaturais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int n = sc.nextInt();
		
		int resultado = SomaPrimeirosNumNaturais(n);
		
		System.out.print("A soma dos primeiros números de " + n + " vale: " + resultado + "!");
		
		sc.close();
	}
	
	public static int SomaPrimeirosNumNaturais(int num) {
		
		if(num <= 1) {
			return num;
		} else {
			return SomaPrimeirosNumNaturais(num - 1) + num;
		}		
	}
}