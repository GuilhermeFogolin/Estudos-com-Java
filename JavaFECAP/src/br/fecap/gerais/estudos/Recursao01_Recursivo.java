package br.fecap.gerais.estudos;

public class Recursao01_Recursivo {

	public static void main(String[] args) {
		
		int numero = 5;
		System.out.println("O fatorial é: " + numero + " é " +  Fatorial(numero) + "!");

	}
	
	public static int Fatorial(int num) {
		if(num <= 1) {
			return 1;
		} else {
			return Fatorial(num - 1) * num;
		}
	}

}