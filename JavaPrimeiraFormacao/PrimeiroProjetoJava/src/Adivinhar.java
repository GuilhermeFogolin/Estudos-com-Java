import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt(10);
        int tentativa;
        int contadorTentativas = 0;

        System.out.print("Digite o valor da tentativa: ");
        tentativa = sc.nextInt();

        while(tentativa != num) {

            if(tentativa > num) {
                System.out.println("O número é menor! Tente novamente.");
            } else{
                System.out.println("O número é maior! Tente novamente.");
            }

            tentativa = sc.nextInt();
            contadorTentativas++;
        }

        System.out.printf("Parabéns! Você acertou que o número era %d! Levou %d tentativa(s).", num, contadorTentativas);

        sc.nextLine(); // Fechando o Scanner.
    }
}
