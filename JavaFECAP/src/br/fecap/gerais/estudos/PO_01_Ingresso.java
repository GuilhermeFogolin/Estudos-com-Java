package br.fecap.gerais.estudos;

public class PO_01_Ingresso {

    private Double valor;

    private PO_01_Cliente cliente;

    private PO_01_Sessao sessao;

    public Double getValor() { return valor; }

    public void setValor(Double valor) { this.valor = valor; }

    public PO_01_Cliente getCliente() { return cliente; }

    public void setCliente(PO_01_Cliente cliente) { this.cliente = cliente; }

    public PO_01_Sessao getSessao() { return sessao; }

    public void setSessao(PO_01_Sessao sessao) { this.sessao = sessao; }

    // Construtor

    public PO_01_Ingresso(Double valor, PO_01_Cliente cliente, PO_01_Sessao sessao) {
        this.valor = valor;
        this.cliente = cliente;
        this.sessao = sessao;
    }

    // Impressão

    public void print() {
        System.out.printf("Valor: R$%.2f" +
                "\nCliente: %s" +
                "\nTelefone: %s" +
                "\nHorário: %s" +
                "\nFilme: %s" +
                "\nSala: %s",
                valor, cliente.getNome(), cliente.getTelefone(),
                sessao.getHorario(), sessao.getFilme().getTitulo(), sessao.getSala().getNum());
    }
}