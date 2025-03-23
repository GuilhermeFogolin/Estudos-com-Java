package br.fecap.gerais.estudos;

import java.util.Scanner;

public class TipoCombustivelCase {

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
		
		switch(escolha) {
		
		case "A":
			total = alcool * litros;
			System.out.printf("\nO valor total é R$%.2f.", total);
			break;
			
		case "D":
			total = diesel * litros;
			System.out.printf("\nO valor total é R$%.2f.", total);
			break;
			
		case "G":
			total = gasolina * litros;
			System.out.printf("\nO valor total é R$%.2f.", total);
			break;
			
		default:
			System.out.print("Não há essa opção no menu. Tente novamente!");
		}

	}

}
