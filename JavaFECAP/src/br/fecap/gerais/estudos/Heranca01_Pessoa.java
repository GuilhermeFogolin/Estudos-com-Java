package br.fecap.gerais.estudos;

public class Heranca01_Pessoa {

	String nome;
	String email;
	String telefone;
	int idade;
	char sexo;
	
	public Heranca01_Pessoa() {}
	
	public void imprimir() {
		System.out.printf("\nNome: %s"
				+ "\nTelefone: %s"
				+ "\nSexo: %c", nome, telefone, sexo);
	}
}
