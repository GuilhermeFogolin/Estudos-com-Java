package br.fecap.gerais.estudos;

import java.util.Scanner;


public class Heranca03_Testes {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// Funcionário comum!
		
		System.out.print("Digite seu nome: ");
		String nomeFc = sc.next();
		
		System.out.print("Digite o seu salário base: R$");
		double sbFc = sc.nextDouble();
		
		Heranca03_Funcionario_Comum fc = new Heranca03_Funcionario_Comum(nomeFc, sbFc);
		
		System.out.println(fc.getDescricao());
		
		// Gerente
		
		System.out.print("\nDigite seu nome: ");
		String nomeGer = sc.next();
		
		System.out.print("Digite o seu salário base: R$");
		double sbGer = sc.nextDouble();
		
		System.out.print("Digite o seu bônus mensal: R$");
		double bonus = sc.nextDouble();
		
		Heranca03_Funcionario_Gerente ger = new Heranca03_Funcionario_Gerente(nomeGer, sbGer, bonus);
		
		System.out.println(ger.getDescricao());
		System.out.printf("Salário final: R$%.2f", ger.calcularSalarioFinal());
		
		// Diretor
		
		System.out.print("\n\nDigite seu nome: ");
		String nomeDir = sc.next();
		
		System.out.print("Digite o seu salário base: R$");
		double sbDir = sc.nextDouble();
		
		System.out.print("Digite o seu percentual nos lucros (entre 0 e 1): ");
		double percentual = sc.nextDouble();
		
		System.out.print("Digite o lucro da empresa no último ano: R$");
		double lucro = sc.nextDouble();
		
		Heranca03_Funcionario_Diretor dir = new Heranca03_Funcionario_Diretor(nomeDir, sbDir, percentual);
		
		dir.setLucroEmpresa(lucro);
		
		System.out.println(dir.getDescricao());
		System.out.printf("Salário final: R$%.2f", dir.calcularSalarioFinal());
		
		sc.close();

	}
}