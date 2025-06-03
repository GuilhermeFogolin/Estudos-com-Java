package ClinicaVeterinaria;

public class Procedimento {

    // Atributos

    private String nome;
    private String descricao;
    private double custo;

    // Acesso

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getCusto() { return custo; }

    public void setCusto(double custo) { this.custo = custo; }

    // Construtor

    public Procedimento(String n, String d, double c) {
        this.nome       = n;
        this.descricao  = d;
        this.custo      = c;
    }
}