package curso_java_programacao;

import java.util.Scanner;

public class JAVA_SEQUENCIAL_DURACAO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total, segundos, minutos, horas;
		
		System.out.print("Digite a duracao em segundos: ");
		total = sc.nextInt();
		
		segundos = total % 60;
		minutos = total / 60 % 60;
		horas = total / 60 / 60;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		
		
		sc.close();
	}

}
