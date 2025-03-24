package br.fecap.gerais.estudos;

import java.util.Scanner;

public class ParImparVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[4];
		int sum = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite o " + (i+1) + "° número: ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 != 0) {
				sum += vetor[i];
			}
		}
		
		System.out.print("A soma dos números ímpares é: " + sum);
		
		sc.close();

	}

}
