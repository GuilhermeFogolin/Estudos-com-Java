package estudosProvaOficial;

public class PO_05_Casa extends PO_05_Imovel implements PO_05_Manutencao {

    // Atributos

    private int numeroDeQuartos;

    // Acesso

    public int getNumeroDeQuartos() { return numeroDeQuartos; }

    public void setNumeroDeQuartos(int numeroDeQuartos) { this.numeroDeQuartos = numeroDeQuartos; }

    // Construtor

    public PO_05_Casa(double tamanho, PO_05_Localizacao localizacao,  int numeroDeQuartos) {
        super(tamanho, localizacao);
        this.numeroDeQuartos = numeroDeQuartos;
    }

    // Metodo

    @Override
    public double calcularTaxaManutencao() {
        return getTamanho() * numeroDeQuartos;
    }
}