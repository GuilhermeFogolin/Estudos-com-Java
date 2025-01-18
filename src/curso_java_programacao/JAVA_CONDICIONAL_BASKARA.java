package curso_java_programacao;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class JAVA_CONDICIONAL_BASKARA {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite os coeficientes: ");
		
		System.out.print("a: ");
		a = sc.nextFloat();
		
		System.out.print("b: ");
		b = sc.nextFloat();
		
		System.out.print("c: ");
		c = sc.nextFloat();
		
		delta = (Math.pow(b, 2)) - (4 * a * c);
		
		if(a != 0 && delta >= 0)
		{
			x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
			x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
			
			System.out.println(String.format("%.4f", x1));
			System.out.print(String.format("%.4f", x2));
		}
		
		else
		{
			System.out.print("Esta equação não possui raízes reais!");
		}
		
		sc.close();

	}

}
