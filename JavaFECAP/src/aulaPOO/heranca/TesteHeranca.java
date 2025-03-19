package aulaPOO.heranca;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu salário: ");
		double sal = sc.nextDouble();
		
		System.out.print("Digite a sua matéria: ");
		String disc = sc.next();

		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite o seu telefone: ");
		String telefone = sc.next();

		Professor prof1 = new Professor();
		
		prof1.nome = nome;
		
		// prof1.disciplina = disc;
		prof1.setDisciplina(disc);
		
		prof1.salario = sal;
		prof1.email = "professor@gmail.com";
		prof1.telefone = telefone;
		prof1.idade = 45;
		
		System.out.println("\nDados do professor: "
				+ "\nNome: " + nome + 
				"\nDisciplina: " + // prof1.disciplina 
				prof1.getDisciplina() +  
				"\nEmail: " + prof1.email);
		
		prof1.imprimir();
		
		sc.close();
	}
}