package curso_java_programacao;

import java.util.Scanner;

public class JAVA_CHATGPT_TABUADA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Para qual número deseja tabuada? ");
		n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + " X " + i + " = " + n * i);
		}

		sc.close();
	}

}
