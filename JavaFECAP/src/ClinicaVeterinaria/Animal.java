package ClinicaVeterinaria;

public class Animal {

    // Atributos

    private String nome;
    private String dataNascimento;
    private String especie;

    // Acessos

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }

    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getEspecie() { return especie; }

    public void setEspecie(String especie) { this.especie = especie; }

    // Construtor

    public Animal(String n, String dN, String e) {
        this.nome = n;
        this.dataNascimento = dN;
        this.especie = e;
    }
}