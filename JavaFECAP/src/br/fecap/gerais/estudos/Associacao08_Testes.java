package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Associacao08_Testes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Título 1° do livro: ");
		String t1 = sc.nextLine();

		System.out.print("Autor 1° do livro: ");
		String a1 = sc.nextLine();

		System.out.print("Código 1° do livro: ");
		String c1 = sc.nextLine();

		System.out.print("Título 2° do livro: ");
		String t2 = sc.nextLine();

		System.out.print("Autor 2° do livro: ");
		String a2 = sc.nextLine();

		System.out.print("Código 2° do livro: ");
		String c2 = sc.nextLine();

		System.out.print("Qual o usuário: ");
		String u = sc.nextLine();

		System.out.print("Qual o id do usuário: ");
		int iu = sc.nextInt();
		sc.nextLine();

		System.out.print("Qual o nome do funcionário que atendeu: ");
		String f = sc.nextLine();

		System.out.print("Qual o id do funcionário: ");
		int idf = sc.nextInt();
		sc.nextLine();

		System.out.print("Qual o cargo do funcionário que atendeu: ");
		String car = sc.nextLine();

		// Construtores
		
		Associacao08_Livro livro1 = new Associacao08_Livro(t1, a1, c1);
		Associacao08_Livro livro2 = new Associacao08_Livro(t2, a2, c2);

		Associacao08_Usuario user = new Associacao08_Usuario(u, iu);
		user.pegarEmprestado(livro1);
		user.pegarEmprestado(livro2);

		Associacao08_Funcionario func = new Associacao08_Funcionario(f, idf, car);
		func.registrarLivro(livro1);
		func.registrarLivro(livro2);

		// Imprimindo informações
		
		System.out.printf("\nO usuário %s pegou os seguintes livros emprestados:", u);
		for (Associacao08_Livro l : user.getLivro()) {
			System.out.println(l.getDescricao());
		}

		System.out.printf("\nQuem registrou esses livros foi o: " +
				"\nNome: %s" +
				"\nID: %d" +
				"\nCargo: %s", f, idf, car);

		sc.close();
	}
}
