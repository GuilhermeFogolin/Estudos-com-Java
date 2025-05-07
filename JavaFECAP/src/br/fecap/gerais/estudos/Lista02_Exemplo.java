package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Lista02_Exemplo {

    public static void main(String[] args) {

        // Criando ArrayList de Strings
        ArrayList<String> list = new ArrayList<String>();

        // Adicionando cores à lista
        list.add("Azul");
        list.add("Amarelo");
        list.add("Marrom");

        // Elemento na posição 02
        System.out.println("Elemento na posição 02: " + list.get(2));

        // Removendo elemento - Por índice ou nome
        list.remove(2);
        list.remove("Azul");

        // Impressão do resultado
        System.out.println("\nCores: ");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
