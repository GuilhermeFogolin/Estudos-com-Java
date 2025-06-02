package ClinicaVeterinaria;

public interface Agendavel {

    // Métodos

    void agendarConsulta(Veterinario vet, String dataHora);
    void cancelarConsulta(String dataHora);
}