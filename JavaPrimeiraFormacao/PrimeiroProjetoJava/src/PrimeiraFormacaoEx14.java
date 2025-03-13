import java.util.Scanner;

public class PrimeiraFormacaoEx14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-- CALCULADORA DE ÁREAS --");
        System.out.print("Digite 1 para quadrado ou 2 para círculo: ");
        int option = sc.nextInt();

        if(option == 1){
            System.out.print("Digite o valor do lado: ");
            double lado = sc.nextDouble();

            double areaQ = Math.pow(lado, 2);

            System.out.printf("A área do quadrado é %.2f unidades quadradas.", areaQ);
        }

        else if(option == 2){
            System.out.print("Digite o valor do raio: ");
            double raio = sc.nextDouble();

            double areaC = Math.PI * Math.pow(raio, 2);

            System.out.printf("A área do círculo é %.2f unidades quadradas.", areaC);
        }

        else{
            System.out.print("Opção inválida!");
        }

    }
}
