package estudosProvaOficial;

public class PO_03_Smartphone extends PO_03_DispositivoEletronico {

    // Atributos

    private int camera;

    // Metodos de acesso

    public int getCamera() { return camera; }

    public void setCamera(int camera) { this.camera = camera; }

    // Construtor

    public PO_03_Smartphone(String marca, String modelo, PO_03_Bateria bateria, int camera) {
        super(marca, modelo, bateria);
        this.camera = camera;
    }

    // Metodo

    @Override
    public void mostrarDetalhes() {
        System.out.printf("\nDetalhes do dispositivo: " +
                "\nMarca: %s" +
                "\nModelo: %s" +
                "\nCâmera: %d pixels" +
                "\nCapacidade da bateria: %d%%", getMarca(), getModelo(), camera, super.getBateria().getCapacidade());
    }
}