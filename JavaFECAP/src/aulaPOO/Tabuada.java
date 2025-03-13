package aulaPOO;

public class Tabuada {

	public static void main(String[] args) {
		
		System.out.println("Imprimindo todas as tabuadas: \n");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			
			System.out.println("\n==============\n");
		}
	}
}
