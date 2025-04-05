package atividadeNI1;

public abstract class Imovel {

	// Variáveis a serem usadas por todas as subclasses
	
	private double tamanho;
	private Localizacao localizacao;
	
	// Método de acesso
	
	public double getTamanho() { return tamanho; }

	public void setTamanho(double tamanho) { this.tamanho = tamanho; }
	
    public Localizacao getLocalizacao() { return localizacao; }
    
    public void setLocalizacao(Localizacao localizacao) { this.localizacao = localizacao; }
	
	// Construtor
	
	public Imovel(double tamanho, Localizacao localizacao) {
		this.tamanho = tamanho;
		this.localizacao = localizacao;
	} 
	
	// Método para ser implementado pelas subclasses
	
	public abstract double calcularTaxaManutencao(); 

}