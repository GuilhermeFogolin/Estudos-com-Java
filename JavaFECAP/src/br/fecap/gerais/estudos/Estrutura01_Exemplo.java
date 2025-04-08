package br.fecap.gerais.estudos;

import java.util.stream.IntStream;

public class Estrutura01_Exemplo {

	public static void main(String[] args) {
		
		int n = 7;
		
		if(n == 0 || n == 3) {
			System.out.println("Dados!");
		} else {
			for(int i : IntStream.range(0, 5).toArray()) {
				System.out.println("Testes!");
			}
		}

	}

}
