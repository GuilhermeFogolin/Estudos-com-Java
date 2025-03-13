package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CHATGPT_NUMEROS_PARES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
