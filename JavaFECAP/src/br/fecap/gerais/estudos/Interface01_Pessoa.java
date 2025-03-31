package br.fecap.gerais.estudos;

public class Interface01_Pessoa implements Interface01_IPessoa {
	
	String nome;
	int idade;

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

	public Interface01_Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Obrigatório a chamar super(nome, idade) nas subclasses porque Interface01_Pessoa não tem um construtor sem parâmetros. 
	// Para evitar isso, é possível criar um construtor sem argumentos na superclasse.

	// Interfaces
	
	@Override
	public void adicionar() {
		System.out.println("Pessoa adicionada: " + nome);
	}
	
	@Override
	public void excluir() {
		System.out.println("Pessoa excluída: " + nome);
	}
	
	@Override
	public void pesquisar() {
		System.out.println("Pesquisando o(a): " + nome);
	}
}