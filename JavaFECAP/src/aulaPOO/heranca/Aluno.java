package aulaPOO.heranca;

public class Aluno extends Pessoa {
	
	int matricula;
	private float notas;
	
	public float getNotas() {
		return notas;
	}

	public void setNotas(float notas) {
		if(notas >= 0 && notas <= 10) {
			this.notas = notas;
		} else {
			System.out.println("\nA média deve estar entre 0 e 10!");
		}
	}

	public Aluno() {}; // ; opcional, caso não há mais NADA embaixo
}
