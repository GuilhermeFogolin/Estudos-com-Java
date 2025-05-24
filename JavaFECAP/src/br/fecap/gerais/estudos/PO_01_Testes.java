package br.fecap.gerais.estudos;

import java.util.Enumeration;
import java.util.Scanner;

public class PO_01_Testes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Valores de entrada

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();

        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        System.out.println("Digite o telefone: ");
        int tel = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o valor do ingresso: ");
        double val = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o horário da sessão: ");
        String hor = sc.nextLine();

        System.out.println("Digite o nome do filme: ");
        String fil = sc.nextLine();

        System.out.println("Digite o gênero: ");
        String gen = sc.nextLine();

        System.out.println("Digite a duração: ");
        int dur = sc.nextInt();

        System.out.println("Digite o número da sala: ");
        int sala = sc.nextInt();

        System.out.println("Digite a capacidade: ");
        int cap = sc.nextInt();

        // Construtores

        PO_01_Cliente cliente   = new PO_01_Cliente(nome, cpf, email, tel);
        PO_01_Filme filme       = new PO_01_Filme(fil, gen, dur);
        PO_01_Sala salaFilme    = new PO_01_Sala(sala, cap);
        PO_01_Sessao sessao     = new PO_01_Sessao(hor, salaFilme, filme);
        PO_01_Ingresso ingresso = new PO_01_Ingresso(val, cliente, sessao);

        // Imprimindo as informações:

        ingresso.print();

        sc.close();

    }
}