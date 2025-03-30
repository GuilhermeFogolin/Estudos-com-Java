package br.fecap.gerais.estudos;

public class Heranca01_Aluno extends Heranca01_Pessoa {
		
	int matricula;
	private float notas;
	
	public float getNotas() {
		return notas;
	}
	
	public void setNotas(float notas) {
		if (notas >= 0 && notas <= 10) {
			this.notas = notas;
		} else {
			System.out.println("A média deve estar entre 0 e 10!");
		}
	}
	
	public Heranca01_Aluno() {}
	
}