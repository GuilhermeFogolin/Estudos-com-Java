package aulaPOO;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o número? ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O número %d é par!", num);
		} else {
			System.out.printf("O número %d é ímpar!", num);
		}
		
		sc.close();
	}
}		
