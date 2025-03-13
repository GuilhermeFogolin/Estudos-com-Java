package heranca;

public class Pessoa {

	String nome;
	String email;
	String telefone;
	int idade;
	char sexo;
	
	public Pessoa() {};
	
	public void imprimir() {
		System.out.println("\nNome: " + nome + 
				"\nIdade: " + idade);
	}
}