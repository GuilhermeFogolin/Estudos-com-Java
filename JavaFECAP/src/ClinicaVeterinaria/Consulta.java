package ClinicaVeterinaria;

import br.fecap.gerais.estudos.Agregacao01_Professor;

import java.util.ArrayList;

public class Consulta {

    // Atributos

    private String dataHora;
    private String motivo;
    private Animal animal;
    private Veterinario vet;
    private ArrayList<Procedimento> pro;

    // Acessos

    public String getDataHora() { return dataHora; }

    public void setDataHora(String dataHora) { this.dataHora = dataHora; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public Animal getAnimal() { return animal; }

    public void setAnimal(Animal animal) { this.animal = animal; }

    public Veterinario getVet() { return vet; }

    public void setVet(Veterinario vet) { this.vet = vet; }

    public ArrayList<Procedimento> getPro() { return pro; }

    public void setPro(ArrayList<Procedimento> pro) { this.pro = pro; }

    // Construtor

    public Consulta(String dH, String m, Animal a, Veterinario v) {
        this.dataHora = dH;
        this.motivo   = m;
        this.animal   = a;
        this.vet      = v;
        this.pro      = new ArrayList<>();
    }

    // Adicionando procedimentos

    public void addProcedimento(Procedimento p) { pro.add(p); }

    // Imprimindo informações

    public void print() {
        System.out.printf("\nInformações da consulta:" +
                "\nAnimal: %s" +
                "\nData de nascimento: %s" +
                "\nMotivo: %s" +
                "\nVeterinário responsável: %s" +
                "\nData e hora: %s", animal.getNome(), animal.getDataNascimento(),
                motivo, vet.getNome(), dataHora);
        System.out.printf("\nProcedimentos realizados: ");
        for(Procedimento p : pro) {
            System.out.printf("\n- %s | R$%.2f", p.getNome(), p.getCusto());
        }
    }
}