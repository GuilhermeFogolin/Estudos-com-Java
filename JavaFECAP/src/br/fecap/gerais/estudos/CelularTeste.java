package br.fecap.gerais.estudos;

import java.util.Scanner;

public class CelularTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Celular cel = new Celular();
		
		System.out.print("Digite a marca: ");
		 cel.marca = sc.next();
		 sc.nextLine();
		 
		 System.out.print("Digite o modelo: ");
		 cel.modelo = sc.next();
		 sc.nextLine();
		 
		 System.out.print("Digite o SO: ");
		 cel.so = sc.next();
		 sc.nextLine();
		 
		 cel.ligar();
		 cel.desligar();
		 cel.Mensagem("\nSeu celular tem as seguintes características: ");
		 System.out.printf("\nMarca: %s"
		 		+ "\nModelo: %s"
		 		+ "\nSO: %s", cel.marca, cel.modelo, cel.so);

		sc.close();

	}
}