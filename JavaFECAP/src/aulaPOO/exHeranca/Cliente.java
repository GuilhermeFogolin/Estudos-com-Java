package exHeranca;

public class Cliente extends Pessoa {
	
	Pessoa pessoa = new Pessoa();
	
	private double valorDivida;

	public double getValorDivida() { return valorDivida; }

	public void setValorDivida(double valorDivida) { this.valorDivida = valorDivida; }
	
	public Cliente() {}
	
	public Cliente(String nome, String fone, double valorDivida) {
		super.setNome(nome); // Super, pois está vindo da classe Pessoa!
		super.setFone(fone);
		// super(nome, fone); Funciona dessa forma também!
		this.valorDivida = valorDivida;
	}
	
	@Override 
	public void imprimir() {
		System.out.println("\nNome: " + super.getNome() + 
				"\nFone: " + super.getFone() + 
				"\nValor da dívida: R$" + valorDivida);
	}
}