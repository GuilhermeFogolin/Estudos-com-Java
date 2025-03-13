import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0.0;
        double mediaDasNotas = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação para o filme? ");

            nota = sc.nextDouble();
            mediaDasNotas += nota;
        }

        mediaDasNotas /= 3;

        System.out.printf("A média das avaliações é igual a %.2f.", mediaDasNotas);

        sc.close(); // Fecha o Scanner!
    }
}
