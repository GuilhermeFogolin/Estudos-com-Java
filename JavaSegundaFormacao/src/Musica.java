public class Musica {

    // Atributos

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacoes;
    int numeroDeAvaliacoes;

    // Método 01

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    // Método 02
    void avaliacao(double nota){
        avaliacoes += nota;
        numeroDeAvaliacoes++;
    }


    // Método 03
    double mediaAvaliacoes() {
        return avaliacoes / numeroDeAvaliacoes;
    }

}

// Continua no Ex03