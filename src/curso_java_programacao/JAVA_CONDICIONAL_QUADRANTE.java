package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CONDICIONAL_QUADRANTE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0)
		{
			if(x > 0 && y > 0)
			{
				System.out.println("Quadrante Q1");
			}
			
			else
			{
				
				if(x > 0 && y < 0)
				{
					System.out.println("Quadrante Q4");
				}
				
				else
				{
					if(x < 0 && y > 0)
					{
						System.out.println("Quadrante Q2");
					}
					
					else
					{
						if(x < 0 && y < 0)
						{
							System.out.println("Quadrante Q3");
						}
					}
				}
			}
			
			System.out.println("Digite as coordenadas: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("Fim");
	}
}
