package estudosProvaOficial;

public class PO_03_Computador extends PO_03_DispositivoEletronico {

    // Atributos

    private int memoriaRAM;

    // Metodos de acesso

    public int getMemoriaRAM() { return memoriaRAM; }

    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    // Construtor

    public PO_03_Computador(String marca, String modelo, PO_03_Bateria bateria, int memoriaRAM) {
        super(marca, modelo, bateria);
        this.memoriaRAM = memoriaRAM;
    }

    // Metodo

    @Override
    public void mostrarDetalhes() {
        System.out.printf("Detalhes do dispositivo: " +
                "\nMarca: %s" +
                "\nModelo: %s" +
                "\nMemória RAM: %d GB" +
                "\nNível da bateria: %d%%", getMarca(), getModelo(), memoriaRAM, super.getBateria().getCapacidade());
    }
}