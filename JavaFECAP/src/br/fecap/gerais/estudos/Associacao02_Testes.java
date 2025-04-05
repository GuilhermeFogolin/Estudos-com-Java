package br.fecap.gerais.estudos;

public class Associacao02_Testes {

	public static void main(String[] args) {
		
		// Criando alunos 
		Associacao02_Aluno aluno01 = new Associacao02_Aluno("José Carlos", 58965);
		Associacao02_Aluno aluno02 = new Associacao02_Aluno("Marina Sena", 12345);
		
		// Criando cursos
		Associacao02_Curso curso01 = new Associacao02_Curso("Apache Airflow");
		Associacao02_Curso curso02 = new Associacao02_Curso("Java: do básico ao avançado");
		
		// Matriculando alunos
		curso01.matricularAluno(aluno01);
		curso02.matricularAluno(aluno01);
		curso01.matricularAluno(aluno02);
		
		// Listando alunos matriculados
		curso01.listarAlunos();
		curso02.listarAlunos();
	}

}
