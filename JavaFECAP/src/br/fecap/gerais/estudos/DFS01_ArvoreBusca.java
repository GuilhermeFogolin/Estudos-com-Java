package br.fecap.gerais.estudos;

import java.util.Stack;

public class DFS01_ArvoreBusca {

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

    // TODO: Método para realizar a busca em profundidade

    public static void dfs(TreeNode root) {

        if(root == null) return; // Se o nó for nulo, retorna

        Stack<TreeNode> stack = new Stack<>(); // Cria uma pilha para armazenar os nós a serem visitados
        stack.push(root); // Adiciona o nó raiz à pilha

        while(!stack.isEmpty()) { // Enquanto a pilha não estiver vazia

            TreeNode current = stack.pop(); // Remove o nó do topo da pilha

            System.out.println(current.value); // Imprime o valor do nó

            if(current.right != null) { // Se houver um filho à direita, adiciona à pilha
                stack.push(current.right);
            }

            if(current.left != null) { // Se houver um filho à esquerda, adiciona à pilha
                stack.push(current.left);
            }
        }
    }

    // Criando uma árvore de exemplo

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        // Realizando a busca em profundidade (DFS)

        System.out.println("DFS: ");
        dfs(root);

    }
}