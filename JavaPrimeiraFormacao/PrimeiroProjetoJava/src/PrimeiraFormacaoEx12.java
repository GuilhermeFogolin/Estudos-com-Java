import java.util.Scanner;

public class PrimeiraFormacaoEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite número: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.printf("O número %d é maior que zero, portanto é POSITIVO.", num);
        } else if(num < 0){
            System.out.printf("O número %d é menor que zero, portanto é NEGATIVO.", num);
        } else {
            System.out.print("O número digitado é zero, logo nem POSITIVO nem NEGATIVO.");
        }
    }
}
