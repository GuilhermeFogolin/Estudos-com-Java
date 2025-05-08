package br.fecap.gerais.estudos;

import java.util.Stack;

public class Pilha01_Exemplo {

    public static void main(String[] args) {

        // Criando a pilha

        Stack<Integer> stack = new Stack<>();

        // Adicionando elementos

        stack.push(12);
        stack.push(06);
        stack.push(2024);

        // Removendo e exibindo elemento do topo (2024)

        System.out.println("Elemento removido: " + stack.pop());

        // Exibindo o elemento atual do topo (06)

        System.out.println("Elemento atual do topp: " + stack.peek());
    }
}