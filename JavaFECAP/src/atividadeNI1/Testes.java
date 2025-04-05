package atividadeNI1;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Casa

		System.out.print("Digite o tamanho (em m²): ");
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
	
		
		// Apartamento
		
		System.out.print("\n\nDigite o tamanho (em m²): ");
		double tamanhoAp = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Digite a rua: ");
		String ruaAp = sc.nextLine();
		
		System.out.print("Digite o número: ");
		String numAp = sc.nextLine();
		
		System.out.print("Digite a cidade: ");
		String cidadeAp = sc.nextLine();
		
		System.out.print("Digite o andar: ");
		int andar = sc.nextInt(); 

		// Apartamento e Localização:
		
		Localizacao localizacaoAp = new Localizacao(ruaAp, numAp, cidadeAp);
		
		Apartamento ap = new Apartamento(tamanhoAp, localizacaoAp, andar);
		
		// Apartamento: Informações
		
				System.out.printf("\n=== Informações do apartamento ==="
						+ "\nTamanho: %.2f m²"
						+ "\nRua: %s"
						+ "\nNúmero: %s"
						+ "\nCidade: %s"
						+ "\nAndar: %d°"
						+ "\nTaxa de manutenção: R$%.2f", 
						ap.getTamanho(), localizacaoAp.getRua(), localizacaoAp.getNumero(), localizacaoAp.getCidade(), ap.getAndar(), ap.calcularTaxaManutencao());
			
		sc.close();
		
	}
}