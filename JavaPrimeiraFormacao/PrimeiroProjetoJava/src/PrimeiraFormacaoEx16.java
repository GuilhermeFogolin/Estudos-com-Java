import java.util.Scanner;

public class PrimeiraFormacaoEx16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num == 0) {
            System.out.print("O número é zero!");
        } else if(num % 2 == 0) {
            System.out.printf("O número %d é par!", num);
        } else{
            System.out.printf("O número %d é ímpar!", num);
        }
    }
}
