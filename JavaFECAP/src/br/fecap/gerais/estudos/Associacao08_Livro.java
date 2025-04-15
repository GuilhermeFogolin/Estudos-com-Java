package br.fecap.gerais.estudos;

public class Associacao08_Livro {

	// Atributos
	
	private String titulo;
	private String autor;
	private String id;
	
	// Métodos de acesso
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	// Construtor
	
	public Associacao08_Livro(String t, String a, String id) {
		this.titulo = t;
		this.autor = a;
		this.id = id;
	}
	
	// Método de impressão
	
	public String getDescricao() {
		return "\nTítulo: " + titulo + "\nAutor: " + autor + "\nID: " + id;
	}
}