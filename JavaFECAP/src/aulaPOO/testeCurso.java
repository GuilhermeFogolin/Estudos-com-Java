package aulaPOO;

public class testeCurso {

	public static void main(String[] args) {
		
		Curso cursoA = new Curso();
		
		cursoA.nome = "Ciência da Computação";
		cursoA.qtdAlunos = 60;
		cursoA.turma = "Terceiro Semestre";
		
		System.out.println("=== Dados do curso ===\n");
		System.out.printf("Nome: %s\n", cursoA.nome);
		System.out.printf("Quantidade de alunos: %d\n", cursoA.qtdAlunos);
		System.out.printf("Turma: %s\n", cursoA.turma);
		
		Curso cursoB = new Curso();
		
		cursoB.nome = "Publicidade e Propaganda";
		cursoB.qtdAlunos = 55;
		cursoB.turma = "Quarto Semestre";
		
		System.out.println("\n=== Dados do curso ===\n");
		System.out.printf("Nome: %s\n", cursoB.nome);
		System.out.printf("Quantidade de alunos: %d\n", cursoB.qtdAlunos);
		System.out.printf("Turma: %s\n", cursoB.turma);
	}
}