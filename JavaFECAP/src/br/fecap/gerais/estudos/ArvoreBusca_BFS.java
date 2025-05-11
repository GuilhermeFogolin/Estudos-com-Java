package br.fecap.gerais.estudos;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBusca_BFS {

    // Definição de um nó da árvore

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // TODO: Método para realizar a busca em largura (BFS) na árvore

    public static void bfs(TreeNode root) {

        if(root == null) return; // Se o nó for nulo, retorna

        Queue<TreeNode> queue = new LinkedList<>(); // Cria uma fila para armazenar os nós a serem visitados
        queue.add(root); // Adiciona o nó raiz à fila

        while(!queue.isEmpty()) { // Enquanto a fila NÃO estiver vazia

            TreeNode current = queue.poll(); // Remove o nó da frente da fila
            System.out.println(current.value); // Imprime o valor do nó

            if(current.left != null) { // Se houver um filho à esquerda, adiciona à fila
                queue.add(current.left);
            }

            if(current.right != null) { // Se houve um filha à direita, adiciona à fila
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        // Criando uma árvore de exemplo

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        // Realizando a busca em largura (BFS)

        System.out.println("BFS traversal: ");
        bfs(root);
    }
}
