public class SegundaFormacaoEx03 {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Car Radio";
        musica.artista = "Twenty One Pilots";
        musica.anoDeLancamento = 2014;

        musica.exibirFichaTecnica();

        musica.avaliacao(8);
        musica.avaliacao(10);
        musica.avaliacao(7.68);
        System.out.printf("Soma das avalições igual a %.2f.\n", musica.avaliacoes);
        System.out.printf("Total das avalições igual a %d.\n", musica.numeroDeAvaliacoes);
        System.out.print("Média das avalições igual a " + musica.mediaAvaliacoes());
    }
}

// Sequência no Musica.java