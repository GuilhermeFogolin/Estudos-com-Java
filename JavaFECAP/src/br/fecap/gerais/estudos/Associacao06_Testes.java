package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Associacao06_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Entrada de dados
		
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		
		// Livro
		
		System.out.print("Título do livro: ");
		String tituloL = sc.nextLine();
		
		System.out.print("Ano de publicação do livro: ");
		int anoL = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Autor: ");
		String autor = sc.nextLine();
		
		// Revista
		
		System.out.print("Título da revista: ");
		String tituloR = sc.nextLine();
		
		System.out.print("Ano de publicação da revista: ");
		int anoR = sc.nextInt();
		
		System.out.print("Número de edição: ");
		int num = sc.nextInt();
		
		// Construtores
		
		// Livro
		
		Associacao06_Livro livro = new Associacao06_Livro(tituloL, anoL, autor);
		
		// Revista
		
		Associacao06_Revista revista = new Associacao06_Revista(tituloR, anoR, num);
		
		// Cliente
		
		Associacao06_Cliente cliente = new Associacao06_Cliente(nome);
		cliente.adicionarMaterial(livro);
		cliente.adicionarMaterial(revista);
		cliente.mostrarMateriaisEmprestados();
		
		sc.close();

	}
}