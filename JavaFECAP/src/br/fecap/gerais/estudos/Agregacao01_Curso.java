package br.fecap.gerais.estudos;

import java.util.*;

public class Agregacao01_Curso {
	
	// Atributos
	
	private String nome;
	private int cargaHoraria;
	private ArrayList<Agregacao01_Professor> professor;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ArrayList<Agregacao01_Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<Agregacao01_Professor> professor) {
		this.professor = professor;
	}
	
	// Construtor
	
	public Agregacao01_Curso(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = new ArrayList<>();
	}
	
	// Método para adicionar um professor ao curso
	
	public void adicionarProfessor(Agregacao01_Professor p) {
		professor.add(p);
	}
	
	// Método para imprimir informações
	
	public void getDescricao() {
		System.out.printf("\nCurso: %s"
				+ "\nCarga horária: %dh", nome, cargaHoraria);
		System.out.println("\nProfessores associados: ");
		for(Agregacao01_Professor p : professor) {
			System.out.println("- " + p.getProfessor() + " (" + p.getEspecialidade() + ")");
		}
	}
	

}