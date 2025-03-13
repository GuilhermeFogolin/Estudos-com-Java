package heranca;

import java.util.Scanner;

public class TestarClasseAluno {

	public static void main(String[] args) {
		
		while(true) {
			
			float[] notas = new float[3];
			String nome;
			float soma = 0, media = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Informe o nome do aluno: ");
			nome = sc.next();
			
			for(int i = 0; i <= 2; i++) {
				System.out.println("Nota: ");
				notas[i] = sc.nextFloat();
				soma += notas[i];
			}
			
			media = soma / notas.length;
			
			// Criando objeto
			
			Aluno aluno = new Aluno();
			
			aluno.nome = nome;
			aluno.setNotas(media);
			
			if(aluno.getNotas() != 0 ) {
				System.out.printf("Nome: " + aluno.nome + 
						"\nNota: " + "%.2f", aluno.getNotas());
			}
			
			System.out.println("\nContinuar? Sim / Não");
			
			sc.nextLine();
			
			String opcao = sc.nextLine().toLowerCase();
			
			if(opcao.equals("não")) {
				break;
			}
		}
	}
}