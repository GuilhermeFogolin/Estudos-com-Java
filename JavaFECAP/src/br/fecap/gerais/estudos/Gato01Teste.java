package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Gato01Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gato01 cat = new Gato01();
		
		System.out.print("Digite o nome: ");
		cat.nome = sc.next();
		sc.nextLine();
		
		System.out.print("Digite a cor: ");
		cat.cor = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o sexo: ");
		cat.sexo = sc.next();
		sc.nextLine();
		
		System.out.print("Digite a idade: ");
		cat.idade = sc.nextInt();
		sc.nextLine();
		
		// Impressão das informações:
		
		System.out.printf("\nSeu gatinho é da seguinte forma: "
				+ "\nNome: %s"
				+ "\nCor: %s"
				+ "\nSexo: %s"
				+ "\nIdade: %d", cat.nome, cat.cor, cat.sexo, cat.idade);
		
		sc.close();
		

	}

}
