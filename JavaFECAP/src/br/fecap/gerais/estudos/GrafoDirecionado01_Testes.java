package br.fecap.gerais.estudos;

public class GrafoDirecionado01_Testes {

    public static void main(String[] args) {

        GrafoDirecionado01 grafo = new GrafoDirecionado01();

        // Adicionando relações de seguidores na rede social

        grafo.adicionarAresta("Fogolin", "Lemos");
        grafo.adicionarAresta("Fogolin", "Yan");
        grafo.adicionarAresta("Lemos", "André");
        grafo.adicionarAresta("Yan", "Gabriel");
        grafo.adicionarAresta("Gabriel", "Fogolin");

        // Obtém os seguidores de alguns usuários

        System.out.println("Seguidores de Fogolin: " + grafo.obterAdjacentes("Fogolin"));
        System.out.println("Seguidores de Lemos: " + grafo.obterAdjacentes("Lemos"));
        System.out.println("Seguidores de Yan: " + grafo.obterAdjacentes("Yan"));
        System.out.println("Seguidores de André: " + grafo.obterAdjacentes("André"));
        System.out.println("Seguidores de Gabriel: " + grafo.obterAdjacentes("Gabriel"));
    }
}
