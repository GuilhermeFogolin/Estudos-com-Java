package aulaPOO;

import java.util.Scanner;

public class Funcao {

	public static void msg() {
		System.out.print("\nBoa noite, pessoal! =)\n");
	}
	
	public static int soma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}
	
	public static void multiplicacao(double num1, double num2) {
		double resultadoMult = num1 * num2;
		System.out.printf("\nA multiplicação de %.2f com %.2f resulta em %.2f.\n", num1, num2, resultadoMult);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\n=== Menu de opções ===\n");
			System.out.println("1 - Imprimir mensagem");
			System.out.println("2 - Somar números");
			System.out.println("3 - Multiplicar números");
			System.out.println("4 - Sair do menu");
			
			System.out.print("\nDigite a sua opção: ");
			int escolha = sc.nextInt();
			
			switch(escolha) {
			
				case 1: {
					msg();
					break;
				}
				
				case 2: {
					System.out.print("\nDigite o primeiro número: ");
					int numSoma1 = sc.nextInt();
					
					System.out.print("\nDigite o segundo número: ");
					int numSoma2 = sc.nextInt();
					
					int finalSoma = soma(numSoma1, numSoma2);
					
					System.out.printf("\nA soma de %d com %d vale %d!\n", numSoma1, numSoma2, finalSoma);
					
					break;
				}
				
				case 3: {
					System.out.print("\nDigite o primeiro número: ");
					double numMult1 = sc.nextDouble();
					
					System.out.print("\nDigite o segundo número: ");
					double numMult2 = sc.nextDouble();
					
					multiplicacao(numMult1, numMult2);
					
					break;
				}
				
				case 4: {
					System.out.print("\nPrograma encerrado!");
					sc.close();
					return;
				}
				
				default: {
					System.out.print("\nOpção inválida! Tente novamente.\n");
				}
			}
		}
	}
}