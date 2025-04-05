package br.fecap.gerais.estudos;

public class Associacao02_Aluno {

	private String nome;
    private int matricula;

    public Associacao02_Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome + " - Matrícula: " + matricula);
    }
}