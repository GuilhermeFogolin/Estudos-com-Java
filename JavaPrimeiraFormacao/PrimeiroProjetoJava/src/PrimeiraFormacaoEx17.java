import java.util.Scanner;

public class PrimeiraFormacaoEx17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para calcular o seu fatorial: ");
        int num = sc.nextInt();

        int fat = 1;

        for(int i = 1; i <= num; i++){
            fat = fat * i;
        }

        System.out.printf("O fatorial de %d é %d.", num, fat);
    }
}
