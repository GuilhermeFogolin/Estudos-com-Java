package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Recursao04_SomaDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.printf("\nA soma dos dígitos de %d vale %d!", n, somaDigitos(n));

    }

    public static int somaDigitos(int n) {

        if(n == 0) {
            return 0;
        } else {
            return n % 10 +  somaDigitos(n / 10);
        }
    }
}