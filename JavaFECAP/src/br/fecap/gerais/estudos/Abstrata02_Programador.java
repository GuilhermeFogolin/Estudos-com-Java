package br.fecap.gerais.estudos;

public class Abstrata02_Programador extends Abstrata02_Empregado {
		
	private float qtdeHoras;
	private float valorHora;
	
	public float getQtdeHoras() { return qtdeHoras; }
	
	public void setQtdeHoras(float qtdeHoras) { this.qtdeHoras = qtdeHoras; }
	
	public float getValorHora() { return valorHora; }
	
	public void setValorHora(float valorHora) { this.valorHora = valorHora; }
	
	public Abstrata02_Programador() {}

	public Abstrata02_Programador(String n, String c, float qh, float vh) {
		super(n, c);
		this.qtdeHoras = qh;
		this.valorHora = vh;
	}

	@Override
	public float calculaSalario() {
		return qtdeHoras * valorHora;
	}
}