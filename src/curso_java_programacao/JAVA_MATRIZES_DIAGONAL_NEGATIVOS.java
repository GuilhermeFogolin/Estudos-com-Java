package curso_java_programacao;

import java.util.Scanner;

public class JAVA_MATRIZES_DIAGONAL_NEGATIVOS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, j, n, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDIAGONAL PRINCIPAL: ");
		for(i = 0; i < n; i++)
		{
			System.out.print(mat[i][i] + "  ");
		}
		
		cont = 0;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				if(mat[i][j] < 0)
				{
					cont = cont + 1;
				}
			}
		}
		System.out.print("\nQUANTIDADE DE NEGATIVOS = " + cont);
		
		sc.close();
	}
}