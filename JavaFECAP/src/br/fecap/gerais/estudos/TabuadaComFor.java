package br.fecap.gerais.estudos;

import java.util.Scanner;

public class TabuadaComFor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("De qual número quer a tabuada? ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			int total = num * i;
			
			System.out.printf("\n%d X %d = %d", num, i, total);
		}
		
		sc.close();

	}

}
