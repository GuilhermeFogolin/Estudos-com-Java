package estudosProvaOficial;

import java.util.ArrayList;

public abstract class PO_02_Usuario {

    private String nome;
    private String matricula;
    private ArrayList<PO_02_Emprestimo> empAtivos;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public ArrayList<PO_02_Emprestimo> getEmpAtivos() { return empAtivos; }

    public void setEmpAtivos(ArrayList<PO_02_Emprestimo> empAtivos) { this.empAtivos = empAtivos; }

    // Construtor

    public PO_02_Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.empAtivos = new ArrayList<>();
    }

    // Metodo

    public abstract boolean podeEmprestar();

    public void adicionaEmprestimo(PO_02_Emprestimo emp) {
        if(podeEmprestar()) {
            empAtivos.add(emp);
        } else {
            System.out.println("Limite de empréstimos atingidos!");
        }
    }

    public void removeEmprestimo(PO_02_Emprestimo emp) {
        empAtivos.remove(emp);
    }



}
