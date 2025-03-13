package curso_java_programacao;

import java.util.Scanner;

public class JAVA_SEQUENCIAL_SOMA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco;
		int quantidade;
		
		System.out.print("Preco unitario do produto: R$");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: R$");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - (preco * quantidade);
		
		if(troco >= 0)
		{
			System.out.print("Troco = R$" + String.format("%.2f", troco));
		}
		
		else
		{
			System.out.print("Dinheiro insuficiente!");
		}
		
		sc.close();

	}

}
