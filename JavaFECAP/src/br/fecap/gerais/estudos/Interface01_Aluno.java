package br.fecap.gerais.estudos;

public class Interface01_Aluno extends Interface01_Pessoa {
	
	private int matricula;
	private float nota;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getNotas() {
		return nota;
	}

	public void setNotas(float nota) {
		this.nota = nota;
	}

	public Interface01_Aluno(String nome, int idade, int matricula, float nota) {
		super(nome, idade);
		this.matricula = matricula;
		this.nota = nota;
	}
}