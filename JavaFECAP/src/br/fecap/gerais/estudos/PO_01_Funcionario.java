package br.fecap.gerais.estudos;

public class PO_01_Funcionario extends PO_01_Pessoa {

    // Atributos

    private String cargo;

    private Double salario;

    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    public Double getSalario() { return salario; }

    public void setSalario(Double salario) { this.salario = salario; }

    // Construtor

    public PO_01_Funcionario(String nome, String cpf, String cargo, Double salario) {
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Impressão

    @Override
    public void print() {
        System.out.printf("Nome: %s" +
                "\nCPF: %s" +
                "\nCargo: %s" +
                "\nSalário: %.2f", super.getNome(), super.getCpf(), cargo, salario);
    }
}