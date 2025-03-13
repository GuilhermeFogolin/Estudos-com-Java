package aulaPOO;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carroA = new Carro();
		
		// Instanciar o carro A
		
		carroA.ano = 2025;
		
		carroA.marca = "Peugeout";
		
		//carroA.modelo = "3008"; 
		
		System.out.println("Dados do primeiro carro: \n");
		System.out.println("Ano: " + carroA.ano);
		System.out.println("Marca: " + carroA.marca);
		System.out.println("Modelo: " + carroA.modelo);
		
		// Instanciar o carro B
		
		Carro carroB = new Carro("Vrum Vrum", 1985);
		
		// carroB.ano = 1968;
		
		// carroB.marca = "Ford";
		
		carroB.modelo = "Velocidade V8";
		
		System.out.println("\nDados do segundo carro: \n");
		System.out.println("Ano: " + carroB.ano);
		System.out.println("Marca: " + carroB.marca);
		System.out.println("Modelo: " + carroB.modelo);
		
		// Instaciar o carro C
		
		Carro carroC= new Carro(1985, "Fusquinha");
		
		carroC.marca = "Volks";
		
		System.out.println("\nDados do segundo carro: \n");
		System.out.println("Ano: " + carroC.ano);
		System.out.println("Marca: " + carroC.marca);
		System.out.println("Modelo: " + carroC.modelo);
	}
}