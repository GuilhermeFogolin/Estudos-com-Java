package br.fecap.gerais.estudos;

import java.util.Scanner;

public class CincoNumerosVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[5];
		double sum = 0;
		double media;
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite o número: ");
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
		}
		
		media = sum / vetor.length;
		
		System.out.printf("\nA média dos números vale: %.2f", media);
		
		sc.close();

	}

}
