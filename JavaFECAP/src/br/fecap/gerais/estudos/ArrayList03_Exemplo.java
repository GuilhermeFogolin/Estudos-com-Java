package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class ArrayList03_Exemplo {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // TODO: dicionando elementos à lista
        fruits.add("Abacate");
        fruits.add("Goiaba");
        fruits.add("Maracujá");

        // TODO: Validando se fruta existe com "contains"
        String searchedFruit = "Limão";

        if(fruits.contains(searchedFruit)) {
            System.out.println(searchedFruit + " está na lista!");
        } else {
            System.out.println(searchedFruit + " não está na lista!");
        }
    }
}