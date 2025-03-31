package br.fecap.gerais.estudos;

public class Interface01_Testes {

	public static void main(String[] args) {

		Interface01_Aluno alu = new Interface01_Aluno("Guilherme", 20, 998877, 8.9f);
		
		Interface01_Professor prof = new Interface01_Professor("José", 56, "Java");
		
		// Objeto alu
		
		alu.adicionar();
		alu.pesquisar();
		alu.excluir();
		
		// Objeto prof
		
		prof.adicionar();
		prof.pesquisar();
		prof.excluir();
	}
}