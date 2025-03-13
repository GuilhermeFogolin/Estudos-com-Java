public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // Número inteiro

        System.out.println("Ano de lançamento: " + anoDeLancamento); // Concatenando

        boolean incluidoNoPlano = true; // Variável booleana

        double notaDoFilme = 6.36; // Decimal

        double media = (9.8 + notaDoFilme + 7.5) / 3; // Importante a precedência
        System.out.println("Média = " + media);

        String sinopse = "Filme de aventura com muitas reviravoltas!"; // Tipo String
        System.out.println(sinopse);

        // Text Block
        String imprimir = """
                Filme Top Gun
                Filme de aventura com muitas reviravoltas!
                Excelente para ver em família.
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(imprimir);

        int classificacao;
        classificacao = (int) (media / 2); // Conversão double para int (sistemas de "estrelas" para a avaliação) - Casting
        System.out.println(classificacao);
    }
}