package Veiculo;

public class Engine {

    // Atributos

    private String type;
    private int horsepower;

    // Acessos

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getHorsepower() { return horsepower; }

    public void setHorsepower(int horsepower) { this.horsepower = horsepower; }

    // Métodos

    public void start() {
        System.out.printf("O motor do tipo %s está ligado!", getType());
    }

    public void stop() {
        System.out.printf("O motor do tipo %s está desligado!", getType());
    }

    public void getEngineDetails() {
        System.out.printf("\n== Informações do motor ==" +
                "\nTipo: %s" +
                "\nCavalos: %d", getType(), getHorsepower());
    }
}