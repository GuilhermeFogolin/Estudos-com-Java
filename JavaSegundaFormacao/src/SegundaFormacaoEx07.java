public class SegundaFormacaoEx07 {
    public static void main(String[] args) {

        idadePessoa idadePessoa = new idadePessoa();

        idadePessoa.setNome("Guilherme Fogolin.");
        idadePessoa.setIdade(19);

        System.out.println(idadePessoa.getNome());
        System.out.println(idadePessoa.getIdade());
        idadePessoa.validarIdade();
    }
}

// Continua no idadePessoa.java