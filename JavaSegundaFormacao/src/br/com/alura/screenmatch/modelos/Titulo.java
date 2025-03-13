package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes; // Encapsulamento! Atributo privado.
    private int totalDasAvaliacoes;
    private int duracaoEmMinutos;

    // Getter permitem acessar os atributos privados.

    public String getNome() { return nome; }

    public int getAnoDeLancamento() { return anoDeLancamento; }

    public boolean isIncluidoNoPlano() { return incluidoNoPlano; }

    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }

    public int getTotalDasAvaliacoes() { return totalDasAvaliacoes; } // Devolve o valor total das avaliações.

    // Setters permitem modificar os atributos privados.

    public void setNome(String nome) { this.nome = nome; } // Criação do Setter

    public void setIncluidoNoPlano(boolean incluidoNoPlano) { this.incluidoNoPlano = incluidoNoPlano; }

    public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

    // Método para exibir informações dos títulos.

    public void exibeFichaTecnica() { // Criar um método

        // Instanciar os objetos
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    // Registra a avaliação de um filme.

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    // Calcula e retorna a média das avaliações.

    public double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
