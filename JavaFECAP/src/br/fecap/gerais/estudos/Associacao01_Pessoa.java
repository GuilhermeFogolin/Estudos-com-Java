package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao01_Pessoa {

	private String nome;

	private ArrayList<Associacao01_Endereco> enderecos;

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Associacao01_Endereco> getEndereco() {
		return enderecos;
	}
	
	public Associacao01_Pessoa(String nome) {
		this.nome = nome;
		this.enderecos = new ArrayList<>();
	}
	
	public void adicionarEndereco(Associacao01_Endereco endereco) {
		enderecos.add(endereco);
	}
	
	public void mostrarInfo() {
		System.out.println("Pessoa: " + nome);
		System.out.println("\nEndereços: ");
		
		for(Associacao01_Endereco endereco : enderecos) {
			System.out.println("- Rua: " + endereco.getRua() + 
					"\n- Cidade: " + endereco.getCidade() + 
					"\n- Estado: " + endereco.getEstado());
		}
	}
}