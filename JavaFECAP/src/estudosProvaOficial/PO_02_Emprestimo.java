package estudosProvaOficial;

public class PO_02_Emprestimo {

    private PO_02_Usuario usuario;
    private PO_02_Livro livro;
    private String dataRetirada;
    private String dataDevolucao;

    public PO_02_Usuario getUsuario() { return usuario; }

    public void setUsuario(PO_02_Usuario usuario) { this.usuario = usuario; }

    public PO_02_Livro getLivro() { return livro; }

    public void setLivro(PO_02_Livro livro) { this.livro = livro; }

    public String getDataRetirada() { return dataRetirada; }

    public void setDataRetirada(String dataRetirada) { this.dataRetirada = dataRetirada; }

    public String getDataDevolucao() { return dataDevolucao; }

    public void setDataDevolucao(String dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    // Construtor

    public PO_02_Emprestimo(PO_02_Usuario usuario,  PO_02_Livro livro, String dataRetirada, String dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    // Metodo

    // TODO: Adicionar usuário
    public void registrarDevolucao() {
        System.out.printf("O livro %s emprestado pelo usuário %s foi devolvido com sucesso!", livro.getTitulo(), usuario.getNome());
    }
}