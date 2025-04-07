package br.fecap.gerais.estudos;

public class Associacao03_Curso {

	// Variáveis
	
	private String titulo;
	private String codigo;
	
	// Métodos de acesso
	
	public String getTitulo() { return titulo; }
	
	public void setTitulo(String titulo) { this.titulo = titulo; }
	
	public String getCodigo() { return codigo; }
	
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	// Construtor
	
	public Associacao03_Curso(String titulo, String codigo) {
		this.titulo = titulo;
		this.codigo = codigo;
	}
	

}
