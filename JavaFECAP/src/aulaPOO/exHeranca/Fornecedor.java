package aulaPOO.exHeranca;

public class Fornecedor extends Pessoa{
	
	private double valorCompra;
	
	public double getValorCompra() { return valorCompra; }

	public void setValorCompra(double valorCompra) { this.valorCompra = valorCompra; }

	public Fornecedor() {};
	
	public Fornecedor(String nome, String fone, double valorCompra) {
		super.setNome(nome);
		super.setFone(fone);
		this.valorCompra = valorCompra;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\nNome: " + super.getNome() + 
				"\nFone: " + super.getFone() + 
				"\nValor da compra: R$" + valorCompra);
	}
}