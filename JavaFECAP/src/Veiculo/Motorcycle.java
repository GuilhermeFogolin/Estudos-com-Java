package Veiculo;

public class Motorcycle extends Vehicle {

    // Atributos

    private boolean hasSidecar;

    // Acessos

    public boolean isHasSidecar() { return hasSidecar; }

    public void setHasSidecar(boolean hasSidecar) { this.hasSidecar = hasSidecar; }

    // Construtor

    public Motorcycle(String make, String model, int year, Engine engine, boolean hasSidecar) {
        super(make, model, year, engine);
        this.hasSidecar = hasSidecar;
    }

    // Métodos

    @Override
    public void startEngine() {
        System.out.printf("\nO motor do tipo %s está ligado na moto %s!", super.getEngine().getType(), super.getModel());
    }

    @Override
    public void stopEngine() {
        System.out.printf("\nO motor do tipo %s está desligado na moto %s!", super.getEngine().getType(), super.getModel());
    }

    // Informações

    public boolean hasSidecar() {
        return hasSidecar;
    }
}