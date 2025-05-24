package br.fecap.gerais.estudos;

public class PO_01_Cliente extends PO_01_Pessoa {

    // Atributos

    private String email;;

    private int telefone;

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getTelefone() { return telefone; }

    public void setTelefone(int telefone) { this.telefone = telefone; }

    // Construtor

    public PO_01_Cliente(String nome, String cpf, String email, int telefone) {
        super(nome, cpf);
        this.email = email;
        this.telefone = telefone;
    }

    // Impressao

    @Override
    public void print() {
        System.out.printf("Nome: %s" +
                "\nCPF: %s" +
                "\nEmail: %s" +
                "\nTelefone: %d", super.getNome(), super.getCpf(), email, telefone);
    }
}