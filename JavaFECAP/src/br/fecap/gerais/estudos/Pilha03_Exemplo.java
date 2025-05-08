package br.fecap.gerais.estudos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pilha03_Exemplo {

    public static void main(String[] args) {

        // Criando a pilha para livros
        Stack<String> books = new Stack<>();

        // Adicionando elementos
        books.push("Ainda Estou Aqui");
        books.push("O Povo Brasileiro");
        books.push("Entendendo Algoritmos");

        // Removendo e exibindo elemento do topo)
        System.out.println("Elemento removido: " + books.pop());

        // Criando a fila para atendimento
        Queue<String> people = new LinkedList<>();

        // Adicionando elementos
        people.offer("José");
        people.offer("Carlos Roberto");
        people.offer("Marcelo Paiva");

        // Removendo o primeiro elemento da fila
        System.out.println("Pessoa atendida: " + people.poll());

        // Exibindo a situação da fila
        System.out.println("Pessoas aguardando: " + people);

    }
}