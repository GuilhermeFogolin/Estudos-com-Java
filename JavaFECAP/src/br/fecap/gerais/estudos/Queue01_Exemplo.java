package br.fecap.gerais.estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue01_Exemplo {

    public static void main(String[] args) {

        // TODO: Criando a fila com a impplementação de LinkedList
        Queue<String> queue = new LinkedList<>();

        // TODO: Adicionando elementos na fila
        queue.offer("Guilherme");
        queue.offer("Reis");
        queue.offer("Fogolin");

        // TODO: Impressão dos elementos com base em FIFO
        System.out.println(queue);

        // TODO: Removendo o PRIMEIRO elemento
        String removedElement = queue.poll();
        System.out.println("Elemento removido: " + removedElement);
        System.out.println("Fila após a remoção: " + queue);

        // TODO: Acessando o PRIMEIRO elemento
        String firstElement = queue.peek();
        System.out.println("Primeiro elemento da lista: " + firstElement);

        // TODO: Validando se a fila está vazia
        boolean isEmpty = queue.isEmpty();
        System.out.println("A fila está vazia? " + isEmpty);
    }
}
