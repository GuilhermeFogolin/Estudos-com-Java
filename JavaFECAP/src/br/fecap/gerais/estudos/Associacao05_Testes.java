package br.fecap.gerais.estudos;

import java.util.*;

public class Associacao05_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do hóspede: ");
		String nome = sc.next();
		
		System.out.print("Digite o CPF: ");
		String cpf = sc.next();
		
		System.out.print("Digite o número do quarto: ");
		int num = sc.nextInt();
		
		System.out.print("Digite o tipo do quarto: ");
		String tipo = sc.next();
		
		System.out.print("Digite o preço por noite: ");
		double preco = sc.nextDouble();
		
		System.out.print("Digite a quantidade de noites: ");
		int qtde = sc.nextInt();
		
		// Construtores
		
		Associacao05_Hospede hospede = new Associacao05_Hospede(nome, cpf);
		
		Associacao05_Quarto quarto = new Associacao05_Quarto(num, tipo, preco);
		
		Associacao05_Reserva reserva = new Associacao05_Reserva(qtde, hospede, quarto);
		
		// Imprimindo informações
		
		reserva.getResumoReserva();
		
		sc.close();

	}

}
