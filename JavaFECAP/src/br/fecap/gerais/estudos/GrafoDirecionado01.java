package br.fecap.gerais.estudos;

import java.util.*;

public class GrafoDirecionado01 {

    private Map<String, List<String>> adjacencias;

    public GrafoDirecionado01() {
        this.adjacencias = new HashMap<>();
    }

    // Adiciona uma aresta direcionada de "de" para "para"

    public void adicionarAresta(String de, String para) {
        adjacencias.computeIfAbsent(de, k -> new ArrayList<>()).add(para);
    }

    public List<String> obterAdjacentes(String de) {
        return adjacencias.getOrDefault(de, new ArrayList<>());
    }
}
