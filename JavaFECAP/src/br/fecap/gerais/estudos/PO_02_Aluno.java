package br.fecap.gerais.estudos;

public class PO_02_Aluno extends PO_02_Usuario {

    private String curso;

    public String getCurso() { return curso; }

    public void setCurso(String curso) { this.curso = curso; }

    // Construtor

    public PO_02_Aluno(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    // Metodo

    @Override
    public boolean podeEmprestar() {
        return getEmpAtivos().size() < 3; // Se menor que 3, return == true. Se maior igual 3, return == false.
    }
}
