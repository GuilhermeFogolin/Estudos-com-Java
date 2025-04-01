package br.fecap.gerais.estudos;

public class Recursao01_SomaDigitos {

	public static void main(String[] args) {
		
		int numero = 5052;
		int soma = calcularSomaDigitos(numero);
		System.out.print("A soma dos dígitos de " + numero + " é: " + soma + "!");
	}
	
	public static int calcularSomaDigitos(int numero) {
		if (numero < 10) {
			return numero;
		} else {
			return numero % 10 + calcularSomaDigitos(numero / 10);
		}
	}
}