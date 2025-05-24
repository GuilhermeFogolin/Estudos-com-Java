package br.fecap.gerais.estudos;

public class PO_01_Filme {

    // Atributos

    private String titulo;

    private String genero;

    private int duracao;

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public int getDuracao() { return duracao; }

    public void setDuracao(int duracao) { this.duracao = duracao; }

    // Construtor

    public PO_01_Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    // Impressão

    public void print() {
        System.out.printf("Título: %s" +
                "\nGênero: %s" +
                "\nDuração: %d", titulo, genero, duracao);
    }
}
