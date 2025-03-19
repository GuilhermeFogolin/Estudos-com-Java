package aulaPOO.Static;

public class ComStatic {
	
	private static int numeroInstancia = 0;
	
	public void setNumeroInstancia(int numeroInstancia) {
		this.numeroInstancia = numeroInstancia;
	}
	
	public ComStatic() {
		// A cada ciração de instância incrementa o contador
		numeroInstancia++; 
	}
	
	public static int getNumeroInstancia() {
		return numeroInstancia;
	}
}