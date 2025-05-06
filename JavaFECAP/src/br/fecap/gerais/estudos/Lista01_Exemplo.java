package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Lista01_Exemplo {

    public static void main(String[] args) {

        // Criando ArrayList de strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos à lista
        lista.add("banana");
        lista.add("maça");
        lista.add("pera");

        // Acessando os elementos da lita
        System.out.println("Elemento da posição 01: " + lista.get(1));

        // Iterando sobre os elementos da lista
        System.out.println("Elementos da lista: ");
        for(String elemento : lista) {
            System.out.println(elemento);
        }

    }
}
