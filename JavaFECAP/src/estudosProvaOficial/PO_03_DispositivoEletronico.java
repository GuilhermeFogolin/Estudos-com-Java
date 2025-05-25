package estudosProvaOficial;

public class PO_03_DispositivoEletronico implements PO_03_Dispositivo {

    // Atributos

    private String marca;
    private String modelo;
    private PO_03_Bateria bateria;

    // Metodos de acesso

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public PO_03_Bateria getBateria() { return bateria; }

    public void setBateria(PO_03_Bateria bateria) { this.bateria = bateria; }

    // Construtor

    public PO_03_DispositivoEletronico(String marca, String modelo, PO_03_Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    // Metodos

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf("Detalhes do dispositivo: " +
                "\nMarca: %s" +
                "\nModelo: %s" +
                "\nNível da bateria: %d", getMarca(), getModelo(), bateria.getNivelAtual());
    }
}