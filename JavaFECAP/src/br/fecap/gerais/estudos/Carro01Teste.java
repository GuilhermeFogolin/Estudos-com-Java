package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Carro01Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carro01 carro = new Carro01();
		
		System.out.print("Digite a marca do carro: ");
		 carro.marca = sc.next();
		
		System.out.print("Digite o ano do carro: ");
		carro.ano = sc.nextInt();
		
		System.out.print("Digite o modelo do carro: ");
		carro.modelo = sc.next();
		
		System.out.printf("\nA marca do carro é: %s."
				+ "\nO ano do carro é: %d."
				+ "\nO modelo do carro é: %s.", carro.marca, carro.ano, carro.modelo);
		
		
		sc.close();
		

	}

}
