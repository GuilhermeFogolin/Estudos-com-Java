package ClinicaVeterinaria;

public abstract class Pessoa {

    // Atributos

    private String nome;
    private String telefone;
    private String id;

    // Acessos

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    // Construtor

    public Pessoa(String n, String t, String id) {
        this.nome = n;
        this.telefone = t;
        this.id = id;
    }
}