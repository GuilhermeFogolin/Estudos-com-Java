package br.fecap.gerais.estudos;

import java.util.Scanner;

public class TipoCombustivelIF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double alcool = 1.7997;
		double diesel = 0.9798;
		double gasolina = 2.1009;
		double total = 0;
		
		System.out.print("Escolha o tipo de combustível: "
				+ "\nA - Álcool"
				+ "\nD - Diesel"
				+ "\nG - Gasolina\n");
		String escolha = sc.next();
		
		System.out.print("Quantos litros? ");
		double litros = sc.nextDouble();
		
		escolha = escolha.toUpperCase();
		
		if(escolha.equals("A")) {
			total = alcool * litros;
		} else if (escolha.equals("D")) {
			total = diesel * litros;
		} else if (escolha.equals("G")) {
			total = gasolina * litros;
		} else {
			System.out.print("Escolha incorreta. Não há essa opção no menu!");
		}
		
		System.out.printf("O total a ser pago é R$%.2f.", total);

	}

}