package estudosProvaOficial;

import atividadeNI1.Imovel;

public class PO_05_Apartamento extends PO_05_Imovel implements PO_05_Manutencao {

    // Atributos

    private int andar;

    // Acesso

    public int getAndar() { return andar; }

    public void setAndar(int andar) { this.andar = andar; }

    // Construtor

    public PO_05_Apartamento(double tamanho, PO_05_Localizacao localizacao, int andar) {
        super(tamanho, localizacao);
        this.andar = andar;
    }

    // Metodo

    @Override
    public double calcularTaxaManutencao() {
        return getTamanho() * 85.00;
    }
}