package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_VETORES_DADOS_PESSOAS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, contHomem, contMulher;
		double media, menor, maior, soma;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		// Contagem para entrada de dados
		
		for(i = 0; i < n; i++)
		{
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		// Contagem para menor altura
		
		menor = altura[0];
		for(i = 1; i < n; i++)
		{
			if(altura[i] < menor)
			{
				menor = altura[i];
			}
		}
		System.out.println("Menor altura = " + String.format("%.2f", menor) + " metros");
		
		// Contagem para maior altura
		
		maior = altura[0];
		for(i = 1; i < n; i++)
		{
			if(altura[i] > maior)
			{
				maior = altura[i];
			}
		}
		System.out.println("Maior altura = " + String.format("%.2f", maior) + " metros");
		
		// Média altura das mulheres
		
		contMulher = 0;
		soma = 0;
		for(i = 0; i < n; i++)
		{
			if(genero[i] == 'F')
			{
				contMulher = contMulher + 1;
				soma = soma + altura[i];
			}
		}
		media = (double) soma / contMulher;
		System.out.println("Média das alturas das mulheres = " + String.format("%.2f", media) + " metros");
		
		// Contagem de homens
		
		contHomem = n - contMulher;
		System.out.print("Número de homens = " + contHomem);
		
		sc.close();

	}
}