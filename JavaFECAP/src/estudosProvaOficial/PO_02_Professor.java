package estudosProvaOficial;

public class PO_02_Professor extends PO_02_Usuario {

    private String departamento;
    private String cargo;

    public String getDepartamento() { return departamento; }

    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    // Construtor

    public PO_02_Professor(String nome, String matricula, String departamento, String cargo) {
        super(nome, matricula);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    // Metodo

    @Override
    public boolean podeEmprestar() {
        return getEmpAtivos().size() < 5;
    }
}
