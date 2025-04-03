package br.fecap.gerais.estudos;

import java.util.stream.IntStream;

public class Algoritmos01_Exemplo01 {

	public static void main(String[] args) {
		
		int n = 7; // Entrada: Um número que vale 7.
		
		if(n == 0 || n == 3) {
			System.out.print("Dados!");
		}
		
		else {
			for(int i : IntStream.range(0, 5).toArray()) {
				System.out.println("Teste!"); // Quantidade de memória = 5. Variável n e cinco I's
			}
		}
	}
}

// Se o n recebe 7, quais linha são executadas e quantas operações? Contar as linhas que são executadas. 