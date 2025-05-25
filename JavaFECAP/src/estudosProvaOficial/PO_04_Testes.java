package estudosProvaOficial;

import java.util.Scanner;

public class PO_04_Testes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados (Professor)

        System.out.print("Digite o nome: ");
        String nomeP = sc.nextLine();

        System.out.print("Digite o seu CPF: ");
        String cpfP = sc.nextLine();

        System.out.print("Digite o seu email: ");
        String emailP = sc.nextLine();

        System.out.print("Digite a sua matrícula: ");
        String matriculaP = sc.nextLine();

        System.out.print("Digite a sua 1a disciplina: ");
        String disciplina1 = sc.nextLine();

        System.out.print("Digite a sua 2a disciplina: ");
        String disciplina2 = sc.nextLine();

        System.out.print("Digite a sua nota: ");
        int notaP = sc.nextInt();

        // Construtor e impressão

        PO_04_Professor professor = new PO_04_Professor(nomeP, cpfP, emailP, matriculaP);
        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);
        professor.ministrarAula();
        professor.receberAvaliacao(notaP);
        professor.apresentar();

        sc.close();

    }
}