package estudosProvaOficial;

public class PO_04_FuncionarioAdm extends PO_04_Pessoa implements PO_04_IAvaliavel{

    // Atributos

    private String setor;
    private String cargo;

    // Metodos de acesso

    public String getSetor() { return setor; }

    public void setSetor(String setor) { this.setor = setor; }

    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    // Construtor

    public PO_04_FuncionarioAdm(String nome, String cpf, String email, String matricula, String setor, String cargo) {
        super(nome, cpf, email);
        this.setor = setor;
        this.cargo = cargo;
    }

    // Metodo

    public void executarTarefa() {
        System.out.printf("Olá! Eu sou o %s e agora estou trabalhando!", super.getNome());
    }

    // Receber nota

    @Override
    public void receberAvaliacao(int nota) {
        System.out.printf("A avaliação do %s foi %d pontos!", super.getNome(), nota);
    }
 }