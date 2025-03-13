package exHeranca;

import java.util.Scanner;

public class TesteHerenca {

	public static void main(String[] args) {
		
		// Entradas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite o seu telefone: ");
		String telefone = sc.next();
		
		System.out.print("Digite o valor da sua dívida: R$");
		double divida = sc.nextDouble();
		
		System.out.print("Digite o valor da sua compra: R$");
		double compra = sc.nextDouble();
		
		// Cliente
		
		Cliente cli = new Cliente();
		
		cli.setNome(nome);
		
		cli.setFone(telefone);
		
		cli.setValorDivida(divida);
		
		// Fornecedor
		
		Fornecedor fnc = new Fornecedor();
		
		fnc.setNome(nome);
		
		fnc.setFone(telefone);
		
		fnc.setValorCompra(compra);
		
		// Impressões
		
		cli.imprimir();
		
		fnc.imprimir();
		
		// Scanner
		
		sc.close();
		
	}
}