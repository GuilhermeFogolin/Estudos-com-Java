package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao04_Biblioteca {

	// Variáveis
	
	private String nome;
	private ArrayList<Associacao04_Livros> livros;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Associacao04_Livros> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Associacao04_Livros> livros) {
		this.livros = livros;
	}
	
	// Construtor
	
	public Associacao04_Biblioteca(String nome) {
		this.nome = nome;
		this.livros = new ArrayList<>();
	}
	
	// Adicionando livros
	
	public void adicionarLivro(Associacao04_Livros l) {
		livros.add(l);
	}
	
	// Listando livros
	
	public void listarLivros() {
		System.out.println("\nNa biblioteca " + nome + " há os seguintes livros: ");
		
		for(Associacao04_Livros livro : livros) {
			System.out.printf("- Nome: %s | Autoria: %s | Ano de publicação: %d.\n", livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
		}
	}	
}