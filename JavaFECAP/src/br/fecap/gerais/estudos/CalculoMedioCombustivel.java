package br.fecap.gerais.estudos;

import java.util.Scanner;

public class CalculoMedioCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos km foram percorridos? ");
		double km = sc.nextDouble();
		
		System.out.print("Quantos litros de combustível? ");
		double litros = sc.nextDouble();
		
		double resultado = km / litros;
		
		System.out.printf("\nO consumo médio de combustível é %.2f km/l.", resultado);
		
		sc.close();

	}

}
