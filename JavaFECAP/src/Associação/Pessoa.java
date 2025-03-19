package Associação;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private List<Endereco> enderecos; // List<NomeDaClasse>
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.enderecos = new ArrayList<>();
	}
}
