package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao08_Usuario {
	
	// Atributos
	
	private String nome;
	private int idUser;
	private ArrayList<Associacao08_Livro> livro;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public ArrayList<Associacao08_Livro> getLivro() {
		return livro;
	}
	public void setLivro(ArrayList<Associacao08_Livro> livro) {
		this.livro = livro;
	}

	// Construtor
	
	public Associacao08_Usuario(String n, int iu) {
		this.nome = n;
		this.idUser = iu;
		this.livro = new ArrayList<>();
	}
	
	// Métodos
	
	public void pegarEmprestado(Associacao08_Livro l) {
		livro.add(l);
	}
	
	public void devolverLivro(Associacao08_Livro l) {
		livro.remove(l);
	}
}