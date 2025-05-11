package br.fecap.gerais.estudos;

// TODO: Implementa uma árvore binária de busca (ABB). Cada nó é um funcionário. Organiza em ordem alfabética.

public class ArvoreBinaria02_BinaryTree {

    static ArvoreBinaria02_Employee root; // Raiz da árvore

    // Inserção de funcionários na árvore

    public void insert(ArvoreBinaria02_Employee employee) {
        if(root == null) { // Se a árvore for nula, o funcionário se torna a raiz
            root = employee;
        } else {
            insertRecursivamente(root, employee); // Caso não, chama um mé_todo auxiliar paa inserir recursivamente
        }
    }

    // Mé_todo recursivo de inserção

    private void insertRecursivamente(ArvoreBinaria02_Employee current, ArvoreBinaria02_Employee employee) {
        if(employee.name.compareTo(current.name) < 0) { // Ir para esquerda ou direita?
            if(current.left == null) { // Se não houver subordinado à esquerda, insere aqui
                current.left = employee;
            } else {
                insertRecursivamente(current.left, employee); // Continua a busca na subárvore à esquerda
            }
        } else {
            if(current.right == null) { // Se não houver subordinado à direita, insere aqui
                current.right = employee;
            } else {
                insertRecursivamente(current.right, employee); // Continua a busca na subárvore à direita
            }
        }
    }

    public static void printInOrder() {
        printInOrderRec(root);
    }

    // Mé_todo auxiliar recursivo para imprimir os funcionários em ordem

    private static void printInOrderRec(ArvoreBinaria02_Employee employee) {
        if(employee != null) {
            printInOrderRec(employee.left); // Subordinado à esquerda
            System.out.println(employee.name + " - " + employee.position); // Funcionário atual
            printInOrderRec(employee.right); // Subordinado à direita
        }
    }
}