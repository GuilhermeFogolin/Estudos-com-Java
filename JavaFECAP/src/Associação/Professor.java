package Associação;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	// Atributos
	
	private String nome;
	private String departamento;
	private List<Curso> cursos;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	// Construtor
	
	public Professor(String nome, String departamento) {
		this.nome = nome;
		this.departamento = departamento;
		this.cursos = new ArrayList<>();
	}
	
	// Impressão
	
	public void mostrarInfo() {
		System.out.println("\nNome do professor: " + nome + 
				"\nNome do departamento: " + departamento + 
				"\nCurso que leciona: " + cursos);
	}
}