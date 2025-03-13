import java.util.Scanner;

public class PrimeiraFormacaoDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: Guilherme Fogolin");
        System.out.println("Tipo de conta: Corrente");
        double saldo = 3000.00;
        System.out.printf("Saldo inicial: R$%.2f\n", saldo);
        System.out.println("**********************************");

        int option = 0;

        while(option != 4) {

            System.out.println("\n\nOperações\n");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            option = sc.nextInt();

            if(option == 1) {
                System.out.printf("O seu saldo é de R$%.2f.", saldo);
            }
            else if(option == 2) {
                System.out.print("Informe o valor a receber: R$");
                double receber = sc.nextDouble();
                saldo += receber;
                System.out.printf("Saldo atualizado em R$%.2f.", saldo);
            }
            else if(option == 3){
                System.out.print("Informe o valor a transferir: R$");
                double transferir = sc.nextDouble();

                if(saldo >= transferir) {
                    saldo -= transferir;
                    System.out.printf("Saldo atualizado em R$%.2f.", saldo);
                } else {
                    System.out.printf("Saldo insuficiente para transferir R$%.2f.", transferir);
                }

            }
            else if(option == 4){
                System.out.print("Programa encerrado com sucesso!");
                sc.close();
            }
            else{
                System.out.print("Opção inválida! Tente novamente.");
            }
        }
    }
}
