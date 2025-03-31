package br.fecap.gerais.estudos;

public class Interface01_Professor extends Interface01_Pessoa {
	
	String disciplina;
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Interface01_Professor(String nome, int idade, String disciplina) {
		super(nome, idade);
		this.disciplina = disciplina;
	};

}