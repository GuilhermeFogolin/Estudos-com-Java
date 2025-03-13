package aulaPOO;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite A para álcool | D para diesel | G para gasolina");
		System.out.print("Qual combustível você deseja: ");
		
		String tipo = sc.next();
		
		System.out.print("Quantos litros você deseja: ");
		
		double valor = sc.nextDouble();
		
		double total = 0;
		
		switch(tipo) {
		
		case "A": total = valor * 1.7997;
			break;
			
		case "D": total = valor * 0.9798;
			break;
			
		case "G": total = valor * 2.1009;
			break;
			
		default: System.out.print("Opção inválida! Tente selecionar novamente.");
			// Não é obrigatório colocar. 
		}
		
		System.out.printf("%f litros custam R$%f.", valor, total);
		
		sc.close();
	}
}
