public class Produto { // Classe produtos

    private String nome; // Atributo nome
    private double preco; // Atributo preco

    public Produto(String nome, double preco) { // Construtor para inicializar nome e preco
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}

// Continua no Ex08
