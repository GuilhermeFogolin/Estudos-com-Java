package br.fecap.gerais.estudos;

import java.util.Scanner;

public class Heranca04_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Viagem de CARRO
		
		System.out.print("Digite o modelo do seu carro: ");
		String modeloCar = sc.next();
		
		System.out.print("Digite quantas pessoas cabem: ");
		double capacidadeCar = sc.nextDouble();
		
		System.out.print("Digite o consumo de combustível total: ");
		double consumoCombustivel = sc.nextDouble();
		
		System.out.print("Quanto está custando o combustível? ");
		double precoCombustivel = sc.nextDouble();
		
		System.out.print("Qual será a distância total percorrida? ");
		double distanciaCar = sc.nextDouble();
		
		Heranca04_Carro car = new Heranca04_Carro(modeloCar, capacidadeCar, consumoCombustivel, precoCombustivel);
		
		System.out.print(car.getDescricao());
		System.out.printf("\nO custo total da viagem é: R$%.2f", car.calcularCustoViagem(distanciaCar));
		
		// Viagem de BICICLETA
		
		System.out.print("\n\nDigite o modelo da sua bicicleta: ");
		String modeloBike = sc.next();
		
		System.out.print("Digite quantas pessoas cabem: ");
		double capacidadeBike = sc.nextDouble();
		
		System.out.print("Qual será a distância total percorrida? ");
		double distanciaBike = sc.nextDouble();
		
		Heranca04_Bicicleta bike = new Heranca04_Bicicleta(modeloBike, capacidadeBike);
		
		System.out.println(bike.getDescricao());
		System.out.printf("O custo total da viagem é: R$%.2f", bike.calcularCustoViagem(distanciaBike));
		
		// Viagem de CAMINHÃO
		
		System.out.print("\n\nDigite o modelo do caminhão: ");
		String modeloCam = sc.next();
		
		System.out.print("Digite quantas kg é suportado: ");
		double capacidadeCam = sc.nextDouble();
		
		System.out.print("Digite o custo por km: ");
		double custo = sc.nextDouble();
		
		System.out.print("Qual será a distância total percorrida? ");
		double distanciaCam = sc.nextDouble();
		
		Heranca04_Caminhao cam = new Heranca04_Caminhao(modeloCam, capacidadeCam, custo);
		
		System.out.println(cam.getDescricao());
		System.out.printf("O custo total da viagem é: R$%.2f", cam.calcularCustoViagem(distanciaCam);
		
		sc.close();

	}

}