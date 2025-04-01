package br.fecap.gerais.estudos;

public class Recursao01_NaoRecursivo {

	public static void main(String[] args) {
		
		int numero = 5;
		System.out.println("O fatorial é: " + Fatorial(numero));
		
	}
	
	public static int Fatorial(int num) {
		
		if(num == 0 || num == 1) {
			return 1;
		} else if (num <= 0) {
			return 0;
		} else {
			int fat = num;
			while(num > 1) {
				num = num - 1;
				fat = fat * num;
			}
			
			return fat;
		}
	}

}