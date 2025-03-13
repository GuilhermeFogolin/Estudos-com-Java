package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_MATRIZES_MATRIZ_GERAL {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, linha, coluna;
		double soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		// Soma dos positivos
		
		soma = 0;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				if(mat[i][j] > 0)
				{
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.println("\nSOMA DOS POSITIVOS = " + soma);
		
		// Escolher linha
		
		System.out.print("\nEscolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(j = 0; j < n; j++)
		{
			System.out.print(mat[linha][j] + "  ");
		}
		
		// Escolher coluna
		
		System.out.print("\n\nEscolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(i = 0; i < n; i++)
		{
			System.out.print(mat[i][coluna] + "  ");
		}
		
		// Diagonal principal
		
		System.out.print(" ");
		System.out.print("\n\nDIAGONAL PRINCIPAL: ");
		for(i = 0; i < n; i++)
		{
			System.out.print(mat[i][i] + "  ");
		}
		
		// Alteração matriz
		
		System.out.println("\n\nMATRIZ ALTERADA: ");
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < 0; j++)
			{
				if(mat[i][j] < 0)
				{
					mat[i][j] = mat[i][j] * mat[i][j];
				}
				
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	
		sc.close();
	}
}