package br.fecap.gerais.estudos;

public class Map01_Testes {

    public static void main(String[] args) {

        Map01 grafo = new Map01(); // Cria um novo grafo para representar a rede

        // Adiciona algumas conexões entre os usuários

        grafo.addConexao("Fogolin", "Lemos");
        grafo.addConexao("Fogolin", "Yan");
        grafo.addConexao("Lemos", "André");
        grafo.addConexao("Yan", "Gabriel");

        // Teste de amigos: exibe os amigos de alguns usuários

        // TODO: Validar por qual motivo está imprimindo repetido

        System.out.println("Amigos de Fogolin: " + grafo.obterAmigos("Fogolin"));
        System.out.println("Amigos de Lemos: " + grafo.obterAmigos("Lemos"));
        System.out.println("Amigos de Yan: " + grafo.obterAmigos("Yan"));
        System.out.println("Amigos de André: " + grafo.obterAmigos("André"));
        System.out.println("Amigos de Gabriel: " + grafo.obterAmigos("Gabriel"));
    }
}
