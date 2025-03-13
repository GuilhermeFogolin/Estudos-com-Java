public class PrimeiraFormacaoEx11 {
    public static void main(String[] args) {
        double precoOriginal = 45.35;
        double desconto = precoOriginal * 0.1;
        double precoFinal = precoOriginal - desconto;

        System.out.printf("R$%.2f com R$%.2f de desconto fica R$%.2f!", precoOriginal, desconto, precoFinal);
    }
}
