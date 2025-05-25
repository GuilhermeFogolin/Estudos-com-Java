package estudosProvaOficial;

public class PO_02_Livro implements PO_02_Emprestavel {

    // Atributos

    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponivel;

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public int getISBN() { return ISBN; }

    public void setISBN(int ISBN) { this.ISBN = ISBN; }

    public boolean isDisponivel() { return disponivel; }

    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    // Construtor

    public PO_02_Livro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponivel = true;
    }

    // Emprestar

    public boolean emprestar() {
        if(disponivel) {        // Se livro disponível
            disponivel = false; // Deixa ele indisponível
            return true;        // Finaliza emprestar()
        }
        return false;           // Se livro indisponível, finaliza emprestar()
    }

    // Devolver

    public void devolver() {
        disponivel = true;
    }

    // Disponível

    public boolean estaDisponivel() {
        return disponivel;
    }
}