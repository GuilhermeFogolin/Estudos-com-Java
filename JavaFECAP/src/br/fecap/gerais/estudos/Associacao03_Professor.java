package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao03_Professor {

	// Variáveis
	
	private String nome;
	private String departamento;
	private ArrayList<Associacao03_Curso> curso;
	
	// Métodos de acesso

	public String getNome() { return nome; }
	
	public String getDepartamento() { return departamento; }
	
	public ArrayList<Associacao03_Curso> getCurso() { return curso; }
	
	// Construtor
	
	public Associacao03_Professor(String nome, String departamento) {
		this.nome = nome;
		this.departamento = departamento;
		this.curso = new ArrayList<>();
	}

	// Adicionar curso para professor
	
	public void adicionarCurso(Associacao03_Curso cursos) {
		curso.add(cursos);
	}
	
	// Exibir informações
	
	public void mostrarInfo() {
		System.out.printf("\nNome: %s"
				+ "\nDepartamento: %s", nome, departamento);
		for(Associacao03_Curso cur : curso) {
			System.out.printf("\nCurso: %s"
					+ "\nCódigo: %s", cur.getTitulo(), cur.getCodigo());
		}
	
	}
	
	

	
}
