package aulaPOO;

public class Vetor {

	public static void main(String[] args) {
		
		int [] num = new int[6]; // "Cabem" seis valores
		
		// Adicionando elementos
		
		for(int i = 0; i < 6; i++) {
			num[i] = i * 2;
		}
		
		// Impressão
		
		for(int i = 0; i < 6; i++) {
			System.out.println("i = " + i + " - num: " + num[i]);
		}
		
		// Tamanho
		
		System.out.print("\nTamanho do vetor: " + num.length);
	}
}