package Static;

public class SemStatic {
	
	private int numeroInstancia = 0;
	
	public void setNumeroInstancia(int numeroInstancia) {
		this.numeroInstancia = numeroInstancia;
	}

	public SemStatic() {
		// A cada ciração de instância incrementa o contador
		numeroInstancia++; 
	}
	
	public int getNumeroInstancia() {
		return numeroInstancia;
	}
}
