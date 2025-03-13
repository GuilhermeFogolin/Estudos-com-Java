public class idadePessoa {

    private String nome;
    private int idade;

    // Getter e Setter para Nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Getter e Setter para Idade
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    // Mé_todo para validar idade
    public void validarIdade() {
        if (idade >= 18) {
            System.out.printf("Você tem %d anos. Ou seja, é maior de idade", idade);
        } else{
            System.out.printf("Você tem %d anos. Ou seja, é menor de idade.", idade);
        }
    }
}

// Continua no exercício 07
