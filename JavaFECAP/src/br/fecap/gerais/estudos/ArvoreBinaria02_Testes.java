package br.fecap.gerais.estudos;

public class ArvoreBinaria02_Testes {

    public static void main(String[] args) {

        ArvoreBinaria02_BinaryTree tree = new ArvoreBinaria02_BinaryTree();

        // Adicionando funcionários à arvore

        tree.insert(new ArvoreBinaria02_Employee("CEO", "Chief Executive Officer"));
        tree.insert(new ArvoreBinaria02_Employee("CTO", "Chief Technology Officer"));
        tree.insert(new ArvoreBinaria02_Employee("CFO", "Chief Financial Officer"));
        tree.insert(new ArvoreBinaria02_Employee("Luis", "Manager"));
        tree.insert(new ArvoreBinaria02_Employee("AEO", "Sei lá"));
        tree.insert(new ArvoreBinaria02_Employee("Roberto", "Developer"));
        tree.insert(new ArvoreBinaria02_Employee("Luiza", "Developer"));

        // Imprimindo os funcionários em diferentes ordens
        System.out.println("Funcionários");
        tree.printInOrder();

        // TODO: Vai imprimindo conforme a ordem alfabética apenas.
    }
}
