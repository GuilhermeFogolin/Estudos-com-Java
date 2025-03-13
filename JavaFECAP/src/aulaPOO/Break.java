package aulaPOO;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		int num;
		
		while (true) {
			
			System.out.print("Digite um número: ");
			
			num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			
			soma += num;
		}
		
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
