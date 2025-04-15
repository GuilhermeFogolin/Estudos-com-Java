package br.fecap.gerais.estudos;

import java.util.ArrayList;

public class Associacao06_Cliente {

	// Atributo
	
	private String nome;

	private ArrayList<Associacao06_MaterialDeLeitura> material;

	// Métodos de acesso 
	
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public ArrayList<Associacao06_MaterialDeLeitura> getMaterial() { return material; }

	public void setMaterial(ArrayList<Associacao06_MaterialDeLeitura> material) { this.material = material;}
	
	// Construtor
	
	public Associacao06_Cliente(String nome) {
		this.nome = nome;
		this.material = new ArrayList<>();
	}

	// Método para adicionar material
	
	public void adicionarMaterial(Associacao06_MaterialDeLeitura m) {
		material.add(m);
	}
	
	// Método para mostrar materiais emprestados
	
	public void mostrarMateriaisEmprestados() {
		System.out.println("\n=== Materiais Emprestados === "
				+ "\nCliente: " + nome);
		for(Associacao06_MaterialDeLeitura materiais : material) {
			System.out.print("\nTítulo: " + materiais.getTitulo() + "\nAno de publicação: " + materiais.getAnoPublicacao() + "\n");
		}
	}	
}