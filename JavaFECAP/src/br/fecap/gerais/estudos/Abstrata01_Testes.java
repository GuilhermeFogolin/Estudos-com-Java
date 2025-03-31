package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Abstrata01_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Triângulo
		
		System.out.print("Digite a base do triângulo: ");
		float b = sc.nextFloat();
		
		System.out.print("Digite a altura do triângulo: ");
		float h = sc.nextFloat();
		
		Abstrata01_Triangulo tri = new Abstrata01_Triangulo(b, h);
		
		tri.mostra();
		
		// Quadrado
		
		System.out.println("");
		System.out.print("\nDigite o lado: ");
		float lado = sc.nextFloat();
		
		Abstrata01_Quadrado qua = new Abstrata01_Quadrado(lado);
		
		qua.mostra();
		
		sc.close();
		
	}
}