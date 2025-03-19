package Associação;

public class Curso {

	// Atributos
	
	private String titulo;
	private String codigo;
	
	// Métodos de acesso
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// Construtor
	public Curso(String tit, String cod) {
		this.titulo = tit;
		this.codigo = cod;
	}
	
	// Impressão
	public void mostrarInfo() {
		System.out.println("Nome do curso: " + titulo + 
				"\nCódigo do curso leciona: " + codigo);
	}	
}