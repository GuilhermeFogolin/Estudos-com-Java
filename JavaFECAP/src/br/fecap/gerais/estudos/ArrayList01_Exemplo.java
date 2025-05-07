package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class ArrayList01_Exemplo {

    public static void main(String[] args) {

        // Criando ArrayList de strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos à lista
        lista.add("Banana");
        lista.add("Maça");
        lista.add("Pera");

        // Acessando os elementos da lita
        System.out.println("Elemento da posição 01: " + lista.get(1));

        // Iterando sobre os elementos da lista
        System.out.println("\nElementos da lista: ");
        for(String elemento : lista) {
            System.out.println(elemento);
        }

    }
}
