package br.fecap.gerais.estudos;

import java.util.Scanner;
import java.util.Stack;

public class Pilha02_Exemplo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Completar a última tarefa adicionada");
            System.out.println("3. Visualizar todas as tarefas");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch(option) {

                case 1:
                    System.out.print("\nDigite a nova tarefa: ");
                    String newTask = sc.nextLine();
                    stack.push(newTask);
                    System.out.println("\nTarefa adicionada com sucesso!\n");
                    break;

                case 2:
                    if(stack.isEmpty()) {
                        System.out.println("\nNenhuma tarefa para completar!");
                    } else {
                        String completedTask = stack.pop();
                        System.out.println("\nTarefa completa: " + completedTask);
                    }
                    break;
                case 3:
                    if(stack.isEmpty()) {
                        System.out.println("Nenhuma tarefa na lista!");
                    } else {
                        System.out.println("Tarefas na lista: ");
                        for(String task : stack) {
                            System.out.println("- " + task);
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }
}