package br.fecap.gerais.estudos;

public class Abstrata02_Testes {

	public static void main(String[] args) {
		
		// Analista
		
		float[] projetos = {150f, 874f, 987f, 1365f};
		
		Abstrata02_Analista ana = new Abstrata02_Analista("José", "111.222.333-44", projetos);
		
		System.out.printf("Nome: %s"
				+ "\nCPF: %s"
				+ "\nSalário: R$%.2f", ana.getNome(), ana.getCPF(), ana.calculaSalario());
		
		// Programador
		
		Abstrata02_Programador pro = new Abstrata02_Programador("Carlos", "999.555.333-11", 48f, 136f);
		
		System.out.printf("\n\nNome: %s"
				+ "\nCPF: %s"
				+ "\nSalário: R$%.2f", pro.getNome(), pro.getCPF(), pro.calculaSalario());
	}
}