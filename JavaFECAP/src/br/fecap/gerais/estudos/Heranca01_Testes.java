package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Heranca01_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Heranca01_Professor pro = new Heranca01_Professor();
		
		System.out.print("Digite o nome: ");
		pro.nome = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o telefone: ");
		pro.telefone = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o sexo: ");
		pro.sexo = sc.next().charAt(0);
		sc.nextLine();
		
		pro.imprimir();
	
		sc.close();

	}

}
