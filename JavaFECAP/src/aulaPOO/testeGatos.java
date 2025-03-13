package aulaPOO;

public class testeGatos {

	public static void main(String[] args) {
		
		Gatos gatoUm = new Gatos();
		
		gatoUm.nome = "Juninha";
		gatoUm.raca = "SRD";
		gatoUm.peso = 7.56;
		gatoUm.cor = "Preta";
		gatoUm.idade = 7;
		
		System.out.println("=== Dados do gato ===\n");
		System.out.printf("Nome: %s\n", gatoUm.nome);
		System.out.printf("Raça: %s\n", gatoUm.raca);
		System.out.printf("Peso: %s kg\n", gatoUm.peso);
		System.out.printf("Cor: %s\n", gatoUm.cor);
		System.out.printf("Idade: %s anos\n", gatoUm.idade);
	}
}