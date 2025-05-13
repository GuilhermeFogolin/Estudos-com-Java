package br.fecap.gerais.estudos;

import java.util.*;

public class Map01 {

    public class Grafo {

        private Map<String, List<String>> adjacencias;

        public Grafo() {
            this.adjacencias = adjacencias;
        }

        // Adiciona uma conexão entre dois usuários

        public void addConexao(String user01, String user02) {

            // Adiciona o user02 à lista de amigos do user01 e vice-versa

            adjacencias.computeIfAbsent(user01, k -> new ArrayList<>()).add(user02);
            adjacencias.computeIfAbsent(user01, k -> new ArrayList<>()).add(user01);
        }

        // Retorna o valor associado a uma chave específica
        // Se a chave não estiver presentem retorna um valor padrão fornecido

        public List<String> obterAmigos(String user) {

            // Retorna a lista de amigos do usuários, se existir

            return adjacencias.getOrDefault(user, new ArrayList<>());
        }
    }
}
