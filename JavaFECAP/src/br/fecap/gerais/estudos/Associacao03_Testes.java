package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Associacao03_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitando informações
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite seu departamento: ");
		String dept = sc.next();
		
		System.out.print("Digite seu curso: ");
		String curso = sc.next();
		
		System.out.print("Digite o código: ");
		String id = sc.next();

		// Construtores
		
		Associacao03_Curso curso_const = new Associacao03_Curso(curso, id);
		
		Associacao03_Professor prof = new Associacao03_Professor(nome, dept);
		
		prof.adicionarCurso(curso_const);
		
		// Mostrando informações
		
		prof.mostrarInfo();
		
		sc.close();
	}

}
