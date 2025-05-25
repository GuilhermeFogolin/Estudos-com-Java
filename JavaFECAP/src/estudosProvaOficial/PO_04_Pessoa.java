package estudosProvaOficial;

public class PO_04_Pessoa {

    // Atributos

    private String nome;
    private String cpf;
    private String email;

    // Metodos de acesso

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    // Construtor

    public PO_04_Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // Metodo apresentar

    public void apresentar() {
        System.out.printf("Olá! Meu nome é %s. Prazer. =D", nome);
    }
}