package br.fecap.gerais.estudos;

import java.util.ArrayList;
import java.util.List;

public class Associacao02_Curso {

	private String nome;
    private List<Associacao02_Aluno> alunos;

    public Associacao02_Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Associacao02_Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso de " + nome);
    }

    public void listarAlunos() {
        System.out.println("\nAlunos matriculados no curso de " + nome + ":");
        for (Associacao02_Aluno a : alunos) {
            a.exibirDados();
        }
    }
}
