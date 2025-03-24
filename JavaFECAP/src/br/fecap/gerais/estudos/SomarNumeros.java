package br.fecap.gerais.estudos;

import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {
		
		// Faça um programa que some todos os números digitados pelo
		// usuário até o número zero ser digitado (use o break).
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		while(true) {
			
			System.out.print("Digite o número: \n");
			num = sc.nextInt();
			
			sum += num;
			
			if(num == 0) {
				break;
			}
			
		}
		
		System.out.print("A soma dos números vale: " + sum);
		
		sc.close();

	}

}
