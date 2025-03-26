package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Triangulo02Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo02 tri = new Triangulo02();
		
		System.out.print("Digite a base: ");
		tri.base = sc.nextFloat();
		
		System.out.print("Digite a altura: ");
		tri.altura = sc.nextFloat();
		
		System.out.println(tri.imprimeDados());
		
		sc.close();
		

	}

}
