package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Heranca02_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Criando "Cliente"

		Heranca02_Cliente cli = new Heranca02_Cliente();
		
		System.out.print("Digite o nome do cliente: ");
		String nomeCli = sc.next();
		
		System.out.print("Digite o telefone do cliente: ");
		String telefoneCli = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o valor da dívida: R$");
		float vd = sc.nextFloat();
		
		cli.setNome(nomeCli);
		cli.setFone(telefoneCli);
		cli.setValorDivida(vd);
		cli.imprimir();
		
		// Criando "Fornecedor"

		Heranca02_Fornecedor forn = new Heranca02_Fornecedor();
		
		System.out.print("\nDigite o nome do fornecedor: ");
		String nomeFor = sc.next();
		
		System.out.print("Digite o telefone do fornecedor: ");
		String telefoneFor = sc.next();
		sc.nextLine();
		
		System.out.print("Digite o valor da dívida: R$");
		float vc = sc.nextFloat();
		
		forn.setNome(nomeFor);
		forn.setFone(telefoneFor);
		forn.setValorCompra(vc);
		forn.imprimir();
		
		sc.close();
		

	}
}