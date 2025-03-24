package br.fecap.gerais.estudos;

public class FuncaoTresArgumentos {

	public static int soma(int a, int b, int c) {
		
		return a + b + c;
		
	}
	
	public static void main(String[] args) {
		
		int total = soma(3, 5, 6);
		
		System.out.println("O total da soma vale: " + total);
		System.out.println("O total da soma vale: " + soma(1, 2, 3));

	}

}
