package atividadeNI1;

public class Apartamento extends Imovel implements Manutencao {

	private int andar;

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	// Construtor
	
	public Apartamento(double tamanho, Localizacao localizacao, int andar) {
		super(tamanho, localizacao);
		this.andar = andar;
	}
	
	// Implementando o método
	
	@Override
	public double calcularTaxaManutencao() {
		return getAndar() * 345.67;
	}	
}