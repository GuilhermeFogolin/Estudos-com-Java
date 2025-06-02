package ClinicaVeterinaria;

public class Cachorro extends Animal implements Agendavel {

    // Atributos

    private String raca;

    // Acesso

    public String getRaca() { return raca; }

    public void setRaca(String raca) { this.raca = raca; }

    // Construtor

    public Cachorro(String n, String dN, String e, String r) {
        super(n, dN, e);
        this.raca = r;
    }

    // Interfaces

    @Override
    public void agendarConsulta(Veterinario vet, String dH) {
        System.out.printf("\nA consulta com o Dr(a) %s foi agendada para %s!", vet.getNome(), dH);
    }

    @Override
    public void cancelarConsulta(String dH) {
        System.out.printf("\nA consulta agendada %s foi cancelada!", dH);
    }
}