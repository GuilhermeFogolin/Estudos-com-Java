package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Associacao04_Testes {

	public static void main(String[] args) {

		// Entrada de dados
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome da biblioteca: ");
		String nome = sc.nextLine();

		System.out.print("Digite o 1° título: ");
		String titulo1 = sc.nextLine();
		
		System.out.print("Digite o 1° autor: ");
		String autor1 = sc.nextLine();
				
		System.out.print("Digite o ano de publicação do 1° livro: ");
		int ano1 = sc.nextInt();
		sc.nextLine();

		System.out.print("\nDigite o 2° título: ");
		String titulo2 = sc.nextLine();
		
		System.out.print("Digite o 2° autor: ");
		String autor2 = sc.nextLine();
		
		System.out.print("Digite o ano de publicação do 2° livro: ");
		int ano2 = sc.nextInt();
		
		// Construtores
		
		Associacao04_Livros livro1 = new Associacao04_Livros(titulo1, autor1, ano1);
		
		Associacao04_Livros livro2 = new Associacao04_Livros(titulo2, autor2, ano2);
		
		Associacao04_Biblioteca bib = new Associacao04_Biblioteca(nome);
		
		// Adicionando livros
		
		bib.adicionarLivro(livro1);
		bib.adicionarLivro(livro2);
		
		// Saída de dados
		
		bib.listarLivros();
		
		sc.close();
		

	}

}