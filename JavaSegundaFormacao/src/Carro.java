public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int idadeDoCarro(int anoAtual) {
        return anoAtual - ano;
    }
}

// Continua no Ex04
