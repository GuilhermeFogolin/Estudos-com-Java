package estudosProvaOficial;

public class PO_04_Aluno extends PO_04_Pessoa {

    // Atributos

    private String matricula;
    private int serie;

    // Metodos de acesso

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public int getSerie() { return serie; }

    public void setSerie(int serie) { this.serie = serie; }

    // Construtor

    public PO_04_Aluno(String nome, String cpf, String email, String matricula, int serie) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.serie = serie;
    }

    // Metodo

    public void estudar() {
        System.out.printf("Olá! Sou o %s e estou estudando agora!", super.getNome());
    }
}