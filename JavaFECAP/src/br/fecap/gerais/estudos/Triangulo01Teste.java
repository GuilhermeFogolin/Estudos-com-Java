package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Triangulo01Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo01 t1 = new Triangulo01(10f, 15f);
		
		System.out.println("A base vale: " + t1.base + " cm.");
		
		System.out.println("A altura vale: " + t1.altura + " cm.");
		
		sc.close();

	}

}
