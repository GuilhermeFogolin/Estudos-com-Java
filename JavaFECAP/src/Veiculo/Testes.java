package Veiculo;

public class Testes {

    public static void main(String[] args) {

        // Construtores

        Engine engine = new Engine("Motor V8", 1000);
        Vehicle car = new Car("FIAT", "Uno", 2019, engine, 4);
        System.out.println(car.getDetails());
        car.startEngine();
        car.stopEngine();
        car.drive();
    }
}