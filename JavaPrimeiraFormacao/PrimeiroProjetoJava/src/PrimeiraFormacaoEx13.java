import java.util.Scanner;

public class PrimeiraFormacaoEx13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Ambos os números digitados são iguais!");
        } else {
            System.out.printf("\nOs números digitados são diferentes. São eles %d e %d.", num1, num2);
        }

        if(num1 > num2){
            System.out.printf("\nO número %d é maior que o número %d.", num1, num2);
        } else {
            System.out.printf("\nO número %d é maior que o número %d.", num2, num1);
        }
    }
}
