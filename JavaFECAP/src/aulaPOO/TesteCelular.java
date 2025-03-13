package aulaPOO;

public class TesteCelular {

	public static void main(String[] args) {
		
		Celular cel = new Celular();
		
		cel.marca = "Apple";
		
		cel.modelo = "iPhone 13";
		
		cel.so = "iOS";
		
		System.out.printf("A marca é %s.\n", cel.marca);
		
		System.out.printf("O modelo é %s.\n", cel.modelo);
		
		System.out.printf("O sistema operacional é %s.\n", cel.so);
		
		cel.ligar();
		
		cel.desligar();
		
		cel.Mensagem("Telefone pronto para utilizar!");
	}
}