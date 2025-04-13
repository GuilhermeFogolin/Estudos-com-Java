package br.fecap.gerais.estudos;

public class Associacao05_Reserva {

	// Atributos
	
	private int quantidadeDeNoites;
	private Associacao05_Hospede hospede;
	private Associacao05_Quarto quarto;
	
	// Métodos de acesso
	
	public int getQuantidadeDeNoites() { return quantidadeDeNoites; }
	
	public void setQuantidadeDeNoites(int quantidadeDeNoites) { this.quantidadeDeNoites = quantidadeDeNoites; }
	
	public Associacao05_Hospede getHospede() { return hospede; }
	
	public void setHospede(Associacao05_Hospede hospede) { this.hospede = hospede; }
	
	public Associacao05_Quarto getQuarto() { return quarto; }
	
	public void setQuarto(Associacao05_Quarto quarto) { this.quarto = quarto; }
	
	// Construtor
	
	public Associacao05_Reserva(int quantidadeDeNoites, Associacao05_Hospede hospede, Associacao05_Quarto quarto) {
		this.quantidadeDeNoites = quantidadeDeNoites;
		this.hospede = hospede;
		this.quarto = quarto;
	}
	
	// Método para calcular valor total
	
	public double calcularValorTotal() {
		return quarto.getPrecoPorNoite() * quantidadeDeNoites;
	}
	
	// Método para imprimir as informações
	
	public void getResumoReserva() {
		System.out.printf("\n\nNome do hóspede: %s"
				+ "\nTipo do quarto: %s"
				+ "\nValor final: R$%.2f", hospede.getNome(), quarto.getTipo(), calcularValorTotal());
	}
}