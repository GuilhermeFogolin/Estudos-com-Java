package br.fecap.gerais.estudos;

import java.util.Scanner;

public class PO_02_Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();

        System.out.print("Digite o curso do aluno: ");
        String curso = sc.nextLine();

        System.out.print("Digite o livro 01: ");
        String l1 = sc.nextLine();

        System.out.print("Digite o autor: ");
        String a1 = sc.nextLine();

        System.out.print("Digite o ISBN: ");
        int i1= sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a data de retirada: ");
        String dr1 = sc.nextLine();

        System.out.print("Digite a data de devolução: ");
        String dv1 = sc.nextLine();

        // Construtores

        PO_02_Aluno aluno = new PO_02_Aluno(nome, matricula, curso);
        PO_02_Livro livro1 = new PO_02_Livro(l1, a1, i1);

        if(livro1.estaDisponivel() && aluno.podeEmprestar()) {
            PO_02_Emprestimo emprestimo1 = new PO_02_Emprestimo(aluno, livro1, dr1, dv1);

            // Registrando o empréstimo
            aluno.adicionaEmprestimo(emprestimo1);
            livro1.emprestar();

            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }

        // Listando empréstimos ativos do aluno
        System.out.println("Empréstimos ativos de " + aluno.getNome() + ":");
        for (PO_02_Emprestimo e : aluno.getEmpAtivos()) {
            System.out.println("- " + e.getLivro().getTitulo() + " (devolução prevista: " + e.getDataDevolucao() + ")");
        }

        // Devolvendo o livro

        PO_02_Emprestimo emprestimoAtivo = aluno.getEmpAtivos().get(0);
        emprestimoAtivo.registrarDevolucao();
        livro1.devolver();
        aluno.removeEmprestimo(emprestimoAtivo);

        System.out.println("\nLivro devolvido com sucesso!");

        sc.close();
    }
}
