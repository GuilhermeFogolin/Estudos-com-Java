public class SegundaFormacaoEx10 {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.setTitulo("The House On Mango Street");
        livro1.setAutor("Sandra Cisneros");

        Livro livro2 = new Livro();

        livro2.setTitulo("Ainda Estou Aqui");
        livro2.setAutor("Marcelo Rubens Paiva");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
