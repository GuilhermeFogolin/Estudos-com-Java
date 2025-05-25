package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Recursao03_PrintNumInteiros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("=== Impressão dos números até 1 ===");
        printNumInteirosDec(num);

        System.out.println("\n=== Impressão dos números até n ===");
        printNumInteirosCre(num);

        sc.close();
    }

    public static void printNumInteirosDec(int n) {

        if(n == 0) return; // Caso BASE
        System.out.println(n);
        printNumInteirosDec(n - 1);

        // TODO: A impressão vem ANTES da chamada recursiva, então o número é exibido antes de continuar
    }

    public static void printNumInteirosCre(int n) {

        if(n == 0) return; // Caseo BASE
        printNumInteirosCre(n - 1);
        System.out.println(n);

        // TODO: A chamada recursiva vem antes da impressão, então ele vai "até o fundo" e só imprime ao voltar
    }
}
