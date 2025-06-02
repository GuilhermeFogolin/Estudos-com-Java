package ClinicaVeterinaria;

public class Veterinario extends Pessoa {

    // Atributos

    private String crmv;
    private String especialidade;

    // Acessos

    public String getCrmv() { return crmv; }

    public void setCrmv(String crmv) { this.crmv = crmv; }

    public String getEspecialidade() { return especialidade; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    // Construtor

    public Veterinario(String n, String t, String id, String c, String e) {
        super(n, t, id);
        this.crmv = c;
        this.especialidade = e;
    }
}