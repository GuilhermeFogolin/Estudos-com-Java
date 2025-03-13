package aulaPOO;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		// Lê dez valores e faz a média
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		double soma = 0;
		
		double [] num = new double[10]; // Cabem 10 valores
		
		double total; 
		
		System.out.println("Digite os números: ");
		for(int i = 0; i < 10; i++) {
			
			num[i] = sc.nextDouble();
			soma = soma + num[i];
			contador++;
		}
		
		total = soma / contador; 
		
		System.out.printf("A média dos valores é igual a %.2f", total);
		
		sc.close();
	}
}