package atividadeNI1;

public class Casa extends Imovel implements Manutencao{

	private int numeroDeQuartos;

	// Métodos de acesso
	
	public int getNumeroDeQuartos() {
		return numeroDeQuartos;
	}

	public void setNumeroDeQuartos(int numeroDeQuartos) {
		this.numeroDeQuartos = numeroDeQuartos;
	}
	
	// Construtor
	
	public Casa(double tamanho, Localizacao localizacao, int numeroDeQuartos) {
		super(tamanho, localizacao);
		this.numeroDeQuartos = numeroDeQuartos;
	}
	
	// Implementando o método
	
	@Override
	public double calcularTaxaManutencao() {
		return getNumeroDeQuartos() * 123.45;
	}
}
