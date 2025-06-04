package Veiculo;

public class Car extends Vehicle{

    // Atributos

    private int numDoors;

    // Acesso

    private int getNumDoors() { return numDoors; }

    private void setNumDoors(int numDoors) { this.numDoors = numDoors; }

    // Construtor

    public Car(String make, String model, int year, Engine engine, int numDoors) {
        super(make, model, year, engine);
        this.numDoors = numDoors;
    }

    // Métodos

    @Override
    public void startEngine() {
        System.out.printf("\nO motor do tipo %s está ligado no carro %s!", super.getEngine().getType(), super.getModel());
    }

    @Override
    public void stopEngine() {
        System.out.printf("\nO motor do tipo %s está desligado no carro %s!", super.getEngine().getType(), super.getModel());
    }
}