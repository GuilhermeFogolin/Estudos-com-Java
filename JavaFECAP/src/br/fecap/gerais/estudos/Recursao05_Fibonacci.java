package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Recursao05_Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qual elemento você quer: ");
        int n = sc.nextInt();

        System.out.printf("\nO elemento na %da posição vale: %d", n, fibonacci(n-1));
        sc.close();
    }

    public static int fibonacci(int n) {

        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}