package estudosProvaOficial;

abstract class PO_01_Pessoa {

    // Atributos

    private String nome;

    private String cpf;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    // Construtor

    public PO_01_Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Metodo

    public abstract void print();
}