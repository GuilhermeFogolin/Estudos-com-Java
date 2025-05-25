package estudosProvaOficial;

import java.util.Scanner;

public class PO_03_TestesDispositivoEletronico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados:

        System.out.print("Digite a marca do computador: ");
        String marcaC = sc.nextLine();

        System.out.print("Digite o modelo do computador: ");
        String modeloC = sc.nextLine();

        System.out.print("Digite a capacidade da bateria do computador: ");
        int capacidadeC = sc.nextInt();

        System.out.print("Digite a memória RAM do computador: ");
        int memoria = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a marca do smartphone: ");
        String marcaS = sc.nextLine();

        System.out.print("Digite o modelo do smartphone: ");
        String modeloS = sc.nextLine();

        System.out.print("Digite a capacidade da bateria do smartphone: ");
        int capacidadeS = sc.nextInt();

        System.out.print("Digite quantos pixels tem a câmera do smartphone: ");
        int pixels = sc.nextInt();

        // Construtores

        // --> Computador

        PO_03_Bateria bateriaC = new PO_03_Bateria(capacidadeC);
        PO_03_Computador computador = new PO_03_Computador(marcaC, modeloC, bateriaC, memoria);
        computador.mostrarDetalhes();

        // --> Smartphone

        PO_03_Bateria bateriaS = new PO_03_Bateria(capacidadeS);
        PO_03_Smartphone smartphone = new PO_03_Smartphone(marcaS, modeloS, bateriaS, pixels);
        smartphone.mostrarDetalhes();

        sc.close();

    }
}