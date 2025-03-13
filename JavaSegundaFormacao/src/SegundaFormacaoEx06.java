public class SegundaFormacaoEx06 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titularConta = "Guilherme Fogolin";

        conta.setNumeroConta(9876);

        conta.setSaldoConta(8500.00);

        System.out.println("Titular: " + conta.titularConta);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldoConta());

        conta.setSaldoConta(1500);
        System.out.println("Saldo Atualizado: " + conta.getSaldoConta());

    }
}
