import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        // Para o filme

        Filme criarFilme = new Filme(); // Criando, de fato, um objeto do tipo filme.

        criarFilme.setNome("As Aventuras dos Três Gatinhos"); // Atribuindo valores.
        criarFilme.setAnoDeLancamento(2025);
        criarFilme.setDuracaoEmMinutos(125);

        criarFilme.exibeFichaTecnica();

        criarFilme.avalia(8);
        criarFilme.avalia(6);
        criarFilme.avalia(5);
        System.out.println("Total de avaliações: " + criarFilme.getTotalDasAvaliacoes());
        System.out.println(criarFilme.mediaDasAvaliacoes());

        Filme outroCriarFilme = new Filme(); // Criando, de fato, um objeto do tipo filme.

        outroCriarFilme.setNome("Jorge, o Pateta"); // Atribuindo valores.
        outroCriarFilme.setAnoDeLancamento(2010);
        outroCriarFilme.setDuracaoEmMinutos(45);

        // Para a série

        Serie serie = new Serie();
        serie.setNome("Orange Is The New Black");
        serie.setAnoDeLancamento(2016);
        serie.exibeFichaTecnica();
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporadas(13);
        serie.setMinutosPorEpisodio(55);
        System.out.println("Duração total: " + serie.getDuracaoEmMinutos() + " minutos.");

        // Calculadora

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(criarFilme);
        calculadora.inclui(outroCriarFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}

// Continua no br.com.alura.screenmatch.modelos.Filme.java