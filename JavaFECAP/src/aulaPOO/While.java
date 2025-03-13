package aulaPOO;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// Contadora: controle o loop. Quantidade que vai repetir.
			// Variáveis diferentes. Por exemplo, "cont" e "soma".
		// Acumuladora: Aglutina os valores. Tem seu valor acrescido ou decrescido. 
		
		// Quantidade total: "qtd++". Contagem de algo dentro do laço de repetição.
			// Geralmente com uma lógico, por exemplo, contar quantos pares. 
		
		// Entrada de valores
		
		// Digitar dez números, soma os números e quantos ímpares.
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		
		int contImpar = 0;
		
		int soma = 0;
		
		while (contador <= 10) {
			
			System.out.printf("Digite o número inteiro: ", contador);
			
			int num = sc.nextInt();
			
			soma = soma + num;
			
			contador++;
			
			if(num % 2 != 0) {
				contImpar++;
			}
			
		}	
		
		System.out.printf("A soma dos números vale %d e há %d número(s) ímpare(s).", soma, contImpar);
		
		sc.close();
	}
}
