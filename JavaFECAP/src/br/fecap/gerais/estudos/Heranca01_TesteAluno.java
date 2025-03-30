package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Heranca01_TesteAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			float[] notas = new float[3];
			
			String nome;
			
			float soma = 0, media = 0;
			
			System.out.print("Informe o nome do aluno: ");
			nome = sc.next();
			
			for(int i = 0; i <= 2; i++) {
				
				System.out.print((i+1) + "a nota: ");
				notas[i] = sc.nextFloat();
				soma += notas[i];
			}
			
			media = soma / notas.length;
			
			// Criando o objeto "Aluno"
			
			Heranca01_Aluno aluno = new Heranca01_Aluno();
			
			aluno.nome = nome;
			aluno.setNotas(media);
			
			if(aluno.getNotas() != 0) {
				System.out.printf("\nNome: %s \nMédia: %.2f", aluno.nome, aluno.getNotas());
			}
			
			// Por qual motivo a condicional acima não é impressa quando a média não é validada no set?
			
			// O if(aluno.getNotas() != 0) pode não ser executado porque, quando uma média inválida é inserida, o atributo notas 
			// nunca é alterado e continua 0.
			
			// Em Java, quando uma variável de instância de tipo primitivo não é explicitamente inicializada, ela recebe um valor padrão. 
			// Para float, esse valor padrão é 0.0.
			
			System.out.println("\nContinuar? Sim ou Não");
			sc.nextLine();	
			System.out.println("");
			
			String choice = sc.nextLine().toLowerCase();
			
			if(choice.equals("não")) {
				break;
			}
		}
	}
}