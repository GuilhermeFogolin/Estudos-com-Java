package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao08_Funcionario extends Associacao08_Usuario {

	// Atributo
	
	private String cargo;
	
	// Métodos de acesso
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Construtor
	
	public Associacao08_Funcionario(String nome, int idFuncionario, String c) {
		super(nome, idFuncionario);
		this.cargo = c;
	}
	
	// Método
	
	public void registrarLivro(Associacao08_Livro l) {
		this.pegarEmprestado(l);
	}
}
