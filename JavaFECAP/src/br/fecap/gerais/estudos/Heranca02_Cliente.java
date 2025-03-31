package br.fecap.gerais.estudos;

public class Heranca02_Cliente extends Heranca02_Pessoa {
	
	private float valorDivida;

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public Heranca02_Cliente() {}

	public Heranca02_Cliente(String n, String f, float v) {
		super.setNome(n);
		super.setFone(f);
		this.valorDivida = v;
	}
	
	@Override
	public void imprimir() {
		System.out.printf("\nNome: %s"
				+ "\nTelefone: %s"
				+ "\nValor da dívida: R$%.2f\n", super.getNome(), super.getFone(), valorDivida);
	}
}