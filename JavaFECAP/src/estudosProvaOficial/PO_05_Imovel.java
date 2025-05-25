package estudosProvaOficial;

public abstract class PO_05_Imovel {

    // Atributos

    private double tamanho;
    private PO_05_Localizacao localizacao;

    // Acessos

    public double getTamanho() { return tamanho; }

    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    public PO_05_Localizacao getLocalizacao() { return localizacao; }

    public void setLocalizacao(PO_05_Localizacao localizacao) { this.localizacao = localizacao; }

    // Construtor

    PO_05_Imovel(double tamanho, PO_05_Localizacao localizacao) {
        this.tamanho = tamanho;
        this.localizacao = localizacao;
    }

    // Metodo

    public abstract double calcularTaxaManutencao();
}