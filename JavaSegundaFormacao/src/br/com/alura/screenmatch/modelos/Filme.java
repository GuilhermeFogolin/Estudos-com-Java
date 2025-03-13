package br.com.alura.screenmatch.modelos;

// Classe: contéudos de um objeto. Abstração. O que é comum.
// PSVM é um métod_o.
// As classes são modelos.

public class Filme extends Titulo { // O filme é um título (herança). Todo filme é um título!

    private String diretor;

    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) { this.diretor = diretor; }
}

// Continua no principal