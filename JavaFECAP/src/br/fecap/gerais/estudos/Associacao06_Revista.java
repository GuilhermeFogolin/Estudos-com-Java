package br.fecap.gerais.estudos;

public class Associacao06_Revista extends Associacao06_MaterialDeLeitura implements Associacao06_Emprestimo{
	
	// Atributo
	
	private int numeroEdicao;

	// Métodos de acesso
	
	public int getNumeroEdicao() { return numeroEdicao; }

	public void setNumeroEdicao(int numeroEdicao) { this.numeroEdicao = numeroEdicao; }
	
	// Construtor
	
	public Associacao06_Revista(String titulo, int anoPublicacao, int numeroEdicao) {
		super(titulo, anoPublicacao);
		this.numeroEdicao = numeroEdicao;
	}
	
	// Extensão de MateriaDeLeitura
	
	@Override
	public String getInformacoes() {
		return "O número de edição é: " + numeroEdicao + "!";
	}
	
	@Override
	public void emprestar() {
		System.out.print("Uma revista está sendo emprestada!");
	}
	
	// Implementação de Emprestimo
	
	@Override
	public void registrarEmprestimo() {
		System.out.print("Uma revista foi emprestada!");
	}
}