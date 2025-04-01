package br.fecap.gerais.estudos;

public class Abstrata02_Analista extends Abstrata02_Empregado {

	private float[] valorPorProjeto;
	
	public float[] getValorPorProjeto() {
		return valorPorProjeto;
	}

	public void setValorPorProjeto(float[] valorPorProjeto) {
		this.valorPorProjeto = valorPorProjeto;
	}

	public Abstrata02_Analista() {}

	public Abstrata02_Analista(String n, String c, float vp[]) {
		super(n, c);
		this.valorPorProjeto = vp;
	}
	
	@Override
	public float calculaSalario() {
		float salario = 0.0f;
		for(float valor : valorPorProjeto) {
			salario += valor;
		}
		return salario;
	}	
}