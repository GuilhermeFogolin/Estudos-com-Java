package curso_java_programacao;

import java.util.Scanner;

public class JAVA_MEDIA_IDADES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, somaIdade = 0, quantidade = 0;
		double media;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		while(idade >= 0)
		{
			somaIdade = somaIdade + idade;
			quantidade = quantidade + 1;
			idade = sc.nextInt();
		}
		
		if(quantidade > 0)
		{
			media = (double) somaIdade / quantidade;
			System.out.print("MEDIA = " + String.format("%.2f", media));
		}
		
		else
		{
			System.out.print("Impossível calcular!");
		}	
	}
}