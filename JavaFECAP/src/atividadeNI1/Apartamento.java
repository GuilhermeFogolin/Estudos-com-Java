package atividadeNI1;

public class Apartamento extends Imovel implements Manutencao {

	// Varuiável
	
	private int andar;
	
	// Métodos de acesso

	public int getAndar() { return andar; }

	public void setAndar(int andar) { this.andar = andar; }
	
	// Construtor
	
	public Apartamento(double tamanho, Localizacao localizacao, int andar) {
		super(tamanho, localizacao);
		this.andar = andar;
	}
	
	// Implementando o método da superclasse
	
	@Override
	public double calcularTaxaManutencao() {
		return getAndar() * 345.67;
	}	
}