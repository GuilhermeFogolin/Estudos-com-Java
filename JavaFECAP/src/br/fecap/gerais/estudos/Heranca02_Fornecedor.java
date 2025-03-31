package br.fecap.gerais.estudos;

public class Heranca02_Fornecedor extends Heranca02_Pessoa {
	
	private float valorCompra;
	
	public float getValorCompra(float valorCompra) {
		return valorCompra;
	}
	
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Heranca02_Fornecedor() {}
	
	public Heranca02_Fornecedor(String n, String f, float vc) {
		super.setNome(n);
		super.setFone(f);
		this.valorCompra = vc;
	}
	
	@Override
	public void imprimir() {
		System.out.printf("\nNome: %s"
				+ "\nTelefone: %s"
				+ "\nValor da compra: %.2f", super.getNome(), super.getFone(), valorCompra);
	}
}