package Interface;

public class TesteInterface {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("José", 20, "12345");
		
		Professor prof = new Professor("Maria", 35, "Matemática");
		
		aluno.adicionar();
		
		aluno.pesquisar();
		
		aluno.excluir();
		
		prof.adicionar();
		
		prof.pesquisar();
		
		prof.excluir();
	}

}
