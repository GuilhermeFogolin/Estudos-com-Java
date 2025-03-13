package aulaPOO;

import java.util.Scanner;

public class TesteCarro2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite a marca: ");
		String marcaSc = sc.nextLine();
		
		System.out.print("Digite o modelo: ");
		String modeloSc = sc.nextLine();
		
		System.out.print("Digite o ano: ");
		int anoSc = sc.nextInt();
		
		System.out.print("Digite o valor da tabela FIPE: ");
		double fipeSc = sc.nextDouble();
		
		sc.close();
		
		Carro2 car = new Carro2(marcaSc, fipeSc);
		
		car.ano = anoSc;
		
		car.modelo = modeloSc;
		
		car.imprimirDados();
		
		System.out.println("\nO valor da venda será R$" + car.calcularValorVenda(car.valorFipe) + ".");
	}
}