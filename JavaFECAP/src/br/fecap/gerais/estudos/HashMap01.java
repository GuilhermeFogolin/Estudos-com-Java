package br.fecap.gerais.estudos;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        // Criando um novo HashMap: <String, Integer>. Chave String e valor Integer

        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando valores

        mapa.put("um", 1); // A chave é "um" e o valor é 1
        mapa.put("dois", 2);
        mapa.put("três", 3);

        // Imprimindo separadamente cada valor associado a sua chave respectiva

        System.out.println(mapa.get("um"));
        System.out.println(mapa.get("dois"));
        System.out.println(mapa.get("três"));

        // Verifica se o mapa contém a chave "dois". Saída: true

        System.out.println(mapa.containsKey("dois"));

        //  Verifica se o mapa contém a chave "quatro". Saída: false

        System.out.println(mapa.containsKey("quatro"));

        // Remove a entrada associada à chave "três" do mapa

        mapa.remove("três");

        // Imprimindo o mapa após a remoção

        System.out.println(mapa);
    }
}
