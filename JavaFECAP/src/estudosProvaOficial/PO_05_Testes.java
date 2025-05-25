package estudosProvaOficial;

import java.util.Scanner;

public class PO_05_Testes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --> Para Casa

        System.out.print("Digite a rua: ");
        String rua = sc.nextLine();

        System.out.print("Digite o número: ");
        String num = sc.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite o tamanho: ");
        double tamanho = sc.nextDouble();

        System.out.print("Digite o número de quartos: ");
        int numQuartos = sc.nextInt();

        // Construtor

        PO_05_Localizacao localizacao = new PO_05_Localizacao(rua, num, cidade);
        PO_05_Casa casa = new PO_05_Casa(tamanho, localizacao, numQuartos);

        // Impressão

        System.out.printf("\nRua: %s" +
                "\nNúmero: %s" +
                "\nCidade: %s" +
                "\nTamanho: %.2f metros quadrados" +
                "\nNúmero de quartos: %d" +
                "\nTaxa de manutenção: R$%.2f",
                rua, num, cidade, tamanho, numQuartos, casa.calcularTaxaManutencao());

        sc.close();

    }
}