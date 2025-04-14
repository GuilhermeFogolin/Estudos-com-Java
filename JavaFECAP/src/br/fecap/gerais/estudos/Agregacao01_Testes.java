package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Agregacao01_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Entrada dos dados
		
		System.out.print("Digite o nome do 1° professor: ");
		String professor01 = sc.nextLine();
		
		System.out.print("Digite a especialidade: ");
		String especialidade01 = sc.nextLine();
		
		System.out.print("Digite o nome do 2° professor: ");
		String professor02 = sc.nextLine();
		
		System.out.print("Digite a especialidade: ");
		String especialidade02 = sc.nextLine();
		
		System.out.print("Digite o nome do curso: ");
		String nomeCurso = sc.nextLine();
		
		System.out.print("Digite a carga horária: ");
		int horas = sc.nextInt();
		
		// Construtores
		
		Agregacao01_Professor pro01 = new Agregacao01_Professor(professor01, especialidade01);
		
		Agregacao01_Professor pro02 = new Agregacao01_Professor(professor02, especialidade02);
		
		Agregacao01_Curso curso = new Agregacao01_Curso(nomeCurso, horas);
		
		// Adicionando professores ao curso
		
		curso.adicionarProfessor(pro01);
		curso.adicionarProfessor(pro02);
		
		// Imprimindo informações
		
		curso.getDescricao();
		
		sc.close();

	}
}