package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() { return tempoTotal; } // Poderia colocar this ou não

    /* public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos(); // Poderia colocar this ou não
    }

    public void inclui(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos(); // Poderia colocar this ou não
    } */

    public void inclui(Titulo titulo) { // Exemplo de polimorfismo
        this.tempoTotal += titulo.getDuracaoEmMinutos(); // Poderia colocar this ou não
    }
}
