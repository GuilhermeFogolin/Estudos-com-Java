package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Carro02Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Primeiro construtor
		
		Carro02 car1 = new Carro02();
		
		car1.marca = "FIAT";
		car1.ano = 2019;
		car1.valorFipe = 138000f;
		
		car1.imprimeDados();
		System.out.printf("\nValor de venda: R$%.2f", car1.calcularValorVenda(car1.valorFipe));
		
		// Segundo construtor
		
		Carro02 car2 = new Carro02("BMW");
		
		car2.ano = 2015;
		car2.modelo = "X9 Turbo";
		car2.valorFipe = 259000f;
		
		System.out.print("\n");
		car2.imprimeDados();
		System.out.printf("\nValor de venda: R$%.2f", car2.calcularValorVenda(car2.valorFipe));
		
		// Terceiro construtor
		
		Carro02 car3 = new Carro02("Chevrolet", 36000f);
		
		car3.ano = 1998;
		car3.modelo = "Vrumzinho";
		
		System.out.print("\n");
		car3.imprimeDados();
		System.out.printf("\nValor de venda: R$%.2f", car3.calcularValorVenda(car3.valorFipe));
		
		sc.close();

	}

}
