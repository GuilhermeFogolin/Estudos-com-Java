public class SegundaFormacaoEx08 {
    public static void main(String[] args) {

        Produto produto = new Produto("Carregador TurboPower 65W", 180);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo preço após o desconto: R$" + produto.getPreco());
    }
}

// Continua em Produto.java