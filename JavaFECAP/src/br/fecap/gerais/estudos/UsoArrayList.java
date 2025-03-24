package br.fecap.gerais.estudos;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<>();
		
		System.out.println("Instruções: "
				+ "\nDigite quantos números inteiros precisar para calcular a média."
				+ "\nDigite um número negativo para finalizar o programa e calcular a média dos números digitados.");
		
		int numero;
		
		while(true) {
			
			System.out.print("\nDigite um número: ");
			numero = sc.nextInt();
			
			if(numero < 0) {
				break;
			}
			
			num.add(numero);
		}
		
		if(num.isEmpty()) {
			System.out.println("Nenhum número foi inserido!");
		} else {
			int soma = 0;
			for(int n : num) { //  for-each: Utilizado para iterar sobre arrays ou coleções 
				soma += n; // Sem necessidade de lidar com índices.
		}
			
			double media = (double) soma / num.size();
			
			System.out.printf("\nA média dos números inseridos é: %.2f", media);
		}
		
		sc.close();

	}

}
