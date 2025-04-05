package atividadeNI1;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Casa

		System.out.print("Digite o tamaho (em m²): ");
		double tamanhoC = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Digite a rua: ");
		String ruaC = sc.nextLine();
		
		System.out.print("Digite o número: ");
		String numC = sc.nextLine();
		
		System.out.print("Digite a cidade: ");
		String cidadeC = sc.nextLine();
		
		System.out.print("Digite o número de quartos: ");
		int numQuartos = sc.nextInt(); 

		// Casa e Localização:
		
		Localizacao localizacaoC = new Localizacao(ruaC, numC, cidadeC);
		
		Casa casa = new Casa(tamanhoC, localizacaoC, numQuartos);
		
		// Casa: Informações
		
		System.out.printf("\n=== Informações da casa ==="
				+ "\nTamanho: %.2f m²"
				+ "\nRua: %s"
				+ "\nNúmero: %s"
				+ "\nCidade: %s"
				+ "\nNúmero de quartos: %d"
				+ "\nTaxa de manutenção: R$%.2f", 
				casa.getTamanho(), localizacaoC.getRua(), localizacaoC.getNumero(), localizacaoC.getCidade(), casa.getNumeroDeQuartos(), casa.calcularTaxaManutencao());
	
		sc.close();
		
	}
}