package br.fecap.gerais.estudos;

public class ArvoreBinaria02_Employee {

    String name;
    String position;
    ArvoreBinaria02_Employee left;
    ArvoreBinaria02_Employee right;

    // Construtor

    public ArvoreBinaria02_Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.left = null;
        this.right = null;
    }
}
