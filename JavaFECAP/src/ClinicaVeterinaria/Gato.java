package ClinicaVeterinaria;

public class Gato extends Animal implements Agendavel {

    // Atributos

    private String pelagem;

    // Acesso

    public String getPelagem() { return pelagem; }

    public void setPelagem(String pelagem) { this.pelagem = pelagem; }

    // Construtor

    public Gato(String n, String dN, String e, String p) {
        super(n, dN, e);
        this.pelagem = p;
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
