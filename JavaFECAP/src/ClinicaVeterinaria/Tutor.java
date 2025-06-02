package ClinicaVeterinaria;

public class Tutor extends Pessoa {

    // Atributos

    private String endereco;
    private Animal animal;

    // Acessos

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Animal getAnimal() { return animal; }

    public void setAnimal(Animal animal) { this.animal = animal; }

    // Construtor

    public Tutor(String n, String t, String id, String e, Animal a) {
        super(n, t, id);
        this.endereco = e;
        this.animal = a;
    }
}