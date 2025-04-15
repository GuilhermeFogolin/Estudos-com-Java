package br.fecap.gerais.estudos;

public abstract class Associacao06_MaterialDeLeitura {

	// Atributos
	
	private String titulo;
	private int anoPublicacao;
	
	// Métodos de acesso
	
	public String getTitulo() { return titulo; }
	
	public void setTitulo(String titulo) { this.titulo = titulo; }
	
	public int getAnoPublicacao() { return anoPublicacao; }
	
	public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
	
	// Construtor
	
	public Associacao06_MaterialDeLeitura(String titulo, int anoPublicacao) {
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}
	
	// Métodos abstratos
	
	abstract String getInformacoes();
	
	abstract void emprestar();
}