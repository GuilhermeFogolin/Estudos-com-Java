package br.fecap.gerais.estudos;

public class Associacao01_Testes {

	public static void main(String[] args) {
		
		// Para endereços
		
		Associacao01_Endereco endereco1 = new Associacao01_Endereco("Rua José Coelho", "Campinas", "São Paulo");
		Associacao01_Endereco endereco2 = new Associacao01_Endereco("Rua Zequinha da Flor", "Caldas Novas", "Fim de Mundo");
		
		// Para pessoa
		
		Associacao01_Pessoa pessoa = new Associacao01_Pessoa("Guilherme Fogolin");
		pessoa.adicionarEndereco(endereco1);
		pessoa.adicionarEndereco(endereco2);
		
		// Mostrando as informações
		
		pessoa.mostrarInfo();

	}

}