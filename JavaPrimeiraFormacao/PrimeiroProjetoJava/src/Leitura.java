import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = sc.nextLine();

        System.out.println("Quantos anos tinha quando o filme foi lançado? ");
        int idade = sc.nextInt();

        System.out.println("Qual a sua avaliação para o filme? ");
        double nota = sc.nextDouble(); // Cuidado ao digitar! Lê com vírgula no Scanner

        System.out.printf("Você tinha %d anos quando o filme %s foi lançado! Além disso, sua avaliação é de %.2f pontos.", idade, filme, nota);

        sc.close(); // Fecha o Scanner!
    }
}
