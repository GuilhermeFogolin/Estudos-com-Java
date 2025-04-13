package br.fecap.gerais.estudos;

public class Agregacao_Professor {
	
	// Atributos
	
	private String professor;

	private String especialidade;
	
	// Métodos de acesso
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	// Imprimindo dados do professor
	
	public String getDescricao() {
		return "\nNome: " + professor + "\nEspecialidade: " + especialidade;
	}

}
