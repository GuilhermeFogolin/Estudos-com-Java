package Interface;

public class Pessoa implements IPessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Implementação dos métodos da interdace IPessoa @Override obriga a não mudar o nome do método
	
	@Override
	public void adicionar() {
		System.out.println("Pessoa adicionada: " + nome);
	}
	
	@Override
	public void excluir() {
		System.out.println("Pessoa excluúda: " + nome);
	}
	
	@Override
	public void pesquisar() {
		System.out.println("Pesquisando pessoa: " + nome);
	}
}
