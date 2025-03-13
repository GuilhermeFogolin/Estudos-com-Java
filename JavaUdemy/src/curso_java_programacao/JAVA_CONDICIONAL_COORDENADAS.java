package curso_java_programacao;

import java.util.Locale;
import java.util.Scanner;

public class JAVA_CONDICIONAL_COORDENADAS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de X = ");
		float x = sc.nextFloat();
		
		System.out.print("Valor de Y = ");
		float y = sc.nextFloat();
		
		
		if(x > 0 && y > 0)
		{
			System.out.print("Quadrante 1 - Q1");
		}
			
		else
		{
			if (x < 0 && y > 0)
		    {
				System.out.print("Quadrante 2 - Q2");
		    }
		    
		    else
		    {
		    	if (x < 0 && y < 0)
		    	{
		    		System.out.print("Quadrante 3 - Q3");
		    	}
		    	
		    	else
		    	{
		    		if(x > 0 && y < 0)
		    		{
		    			System.out.print("Quadrante 4 - Q4");
		    		}
		    		
		    		else
		    		{
		    			if(x == 0 && y != 0)
		    			{
		    				System.out.print("Eixo Y");
		    			}
		    			
		    			else
		    			{
		    				if(x != 0 && y == 0)
		    				{
		    					System.out.print("Eixo X");
		    				}
		    				
		    				else
		    				{
		    					System.out.print("Origem");
		    				}
		    			}
		    		}
		    	}
		    }
		}
	}
}