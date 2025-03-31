package br.fecap.gerais.estudos;

public class Interface02_Testes {

	public static void main(String[] args) {
		
		// Para o quadrado
		
		Interface02_Quadrado qua = new Interface02_Quadrado(5.58f);
		
		qua.mostra();
		qua.desenhar();
		
		// Para o triângulo
		
		Interface02_Triangulo tri = new Interface02_Triangulo(4.69f, 3.58f);
		
		tri.mostra();
		tri.desenhar();

	}

}