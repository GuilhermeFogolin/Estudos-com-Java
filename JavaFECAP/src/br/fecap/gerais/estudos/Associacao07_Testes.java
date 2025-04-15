package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Associacao07_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Efetivo
		
		System.out.print("Digite o nome do efetivo: ");
		String nomeEfe = sc.nextLine();
		
		System.out.print("Digite a matrícula do efetivo: ");
		int matriculaEfe = sc.nextInt();
		
		System.out.print("Digite o salário mensal: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		
		// Terceiro
		
		System.out.print("\nDigite o nome do terceiro: ");
		String nomeTer = sc.nextLine();
		
		System.out.print("Digite a matrícula do terceiro: ");
		int matriculaTer = sc.nextInt();
		
		System.out.print("Digite as horas trabalhadas: ");
		double horas = sc.nextDouble();
		
		System.out.print("Digite o valor da hora: R$");
		double valor = sc.nextDouble();
		
		// Construtor e métodos
		
		// Efetivo
		
		Associacao07_Efetivo efe = new Associacao07_Efetivo(nomeEfe, matriculaEfe, salario);
		efe.imprimirCracha();
		System.out.println("\nSalário: R$" + efe.calcularSalario());
		
		// Terceiro
		
		Associacao07_Terceiro ter = new Associacao07_Terceiro(nomeTer, matriculaTer, horas, valor);
		ter.imprimirCracha();
		System.out.println("\nSalário: R$" + ter.calcularSalario());
		
		sc.close();

	}

}