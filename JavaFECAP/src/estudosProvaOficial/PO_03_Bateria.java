package estudosProvaOficial;

public class PO_03_Bateria {

    // Atributos

    private int capacidade;
    private int nivelAtual;

    // Metodos de acesso

    public int getCapacidade() { return capacidade; }

    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public int getNivelAtual() { return nivelAtual; }

    public void setNivelAtual(int nivelAtual) { this.nivelAtual = nivelAtual; }

    // Construtor

    public PO_03_Bateria(int capacidade) {
        this.capacidade = capacidade;
    }

    // Metodos

    public void consumirEnergia() {
        System.out.println("Consumindo energia da bateria...");
    }

    public void mostrarBateria() {
        System.out.printf("Nível da bateria: %d", nivelAtual);
    }
}