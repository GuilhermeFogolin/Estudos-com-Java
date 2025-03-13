package curso_java_programacao;

import java.util.Scanner;

public class JAVA_MATRIZES_ACIMA_DIAGONAL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, soma;
		
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
		
		soma = 0;
		for(i = 0; i < n; i++)
		{	
			j = i;
			
			for(j = j + 1; j < n; j++)
			{
				soma = soma + mat[i][j];
			}
		}
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL =  " + soma);
		
		sc.close();
	}
}