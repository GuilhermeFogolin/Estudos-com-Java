package estudosProvaOficial;

import java.util.ArrayList;

public class PO_04_Professor extends PO_04_Pessoa implements PO_04_IAvaliavel {

    // Atributos

    private String matricula;
    private ArrayList<String> disciplina;

    // Metodos de acesso

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public ArrayList<String> getDisciplina() { return disciplina; }

    public void setDisciplina(ArrayList<String> disciplina) { this.disciplina = disciplina; }

    // Construtor

    public PO_04_Professor(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.disciplina = new ArrayList<>();
    }

    // Adicionando disciplina

    public void adicionarDisciplina(String disciplina) {
        this.disciplina.add(disciplina);
    }

    // Metodo

    public void ministrarAula() {
        System.out.printf("Olá, sou o professor %s!", super.getNome());
        System.out.println("\nMinistro as seguintes aulas: ");
        for (String d : disciplina) {
            System.out.println("- " + d);
        }
    }

    // Receber nota

    @Override
    public void receberAvaliacao(int nota) {
        System.out.printf("A avaliação do %s foi %d pontos!", super.getNome(), nota);
    }
}
