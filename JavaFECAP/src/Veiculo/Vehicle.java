package Veiculo;

public abstract class Vehicle implements Drivable {

    // Atributos

    private String make;
    private String model;
    private int year;
    private Engine engine;

    // Encapsulamento

    public String getMake() { return make; }

    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public Engine getEngine() { return engine; }

    public void setEngine(Engine engine) { this.engine = engine; }

    // Construtor

    public Vehicle(String ma, String mo, int y, Engine e) {
        this.make = ma;
        this.model = mo;
        this.year = y;
        this.engine = e;
    }

    // Métodos abstratos

    public abstract void startEngine();
    public abstract void stopEngine();

    // Informações

    public String getDetails() {
        return "\nFabricante: " + getMake() + "\nModelo: " + getModel() + "\nAno: " + getYear() +
                "\nTipo de motor: " + engine.getType() + "\nCavalos: " + engine.getHorsepower();
    }

    // Interface

    @Override
    public void drive() {
        System.out.printf("O veículo %s está pronto para ser dirigido!", getModel());
    }
}