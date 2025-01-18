package curso_java_programacao;

import java.util.Scanner;

public class JAVA_MATRIZES_CADA_LINHA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int[] vet = new int [n];
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMAIOR ELEMENTO DE CADA LINHA: ");
		for(i = 0; i < n; i++)
		{
			maior = mat[i][0];
			
			for(j = 0; j < n; j++)
			{
				if(mat[i][j] > maior)
				{
					maior = mat[i][j];
				}
			}
			
			System.out.println(maior);
		}

		sc.close();
	}
}