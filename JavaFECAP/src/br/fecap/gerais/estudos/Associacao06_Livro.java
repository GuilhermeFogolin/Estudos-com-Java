package br.fecap.gerais.estudos;

public class Associacao06_Livro extends Associacao06_MaterialDeLeitura implements Associacao06_Emprestimo {

	// Atributo
	
	private String autor;
	
	// Métodos de acesso
	
	public String getAutor() { return autor; }

	public void setAutor(String autor) { this.autor = autor; }
	
	// Construtor
	
	public Associacao06_Livro(String titulo, int anoPublicacao, String autor) {
		super(titulo, anoPublicacao);
		this.autor = autor;
	}
	
	// Extensão de MateriaDeLeitura
	
	@Override
	public String getInformacoes() {
		return "O autor é: " + autor + "!";
	}
	
	@Override
	public void emprestar() {
		System.out.print("Um livro está sendo emprestado!");
	}
	
	// Implementação de Emprestimo
	
	@Override
	public void registrarEmprestimo() {
		System.out.print("Um livro foi emprestado!");
	}
}