import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0.0;
        double mediaDasNotas = 0.0;
        int contador = 0;

        while (nota != 99) {
            System.out.println("Digite a sua avaliação para o filme ou 99 para encerrar! ");
            nota = sc.nextDouble();

            if (nota != 99) { // Caso não, o 99 vai ser SOMADO junto.
                mediaDasNotas += nota;
                contador++;
            } else if (contador == 0) {
                System.out.println("Não há média das notas, pois nenhum valor foi digitado!");
            }
        }

        mediaDasNotas = mediaDasNotas / contador;

        System.out.printf("A média das avaliações é igual a %.2f.", mediaDasNotas);

        sc.close(); // Fecha o Scanner!
    }
}
