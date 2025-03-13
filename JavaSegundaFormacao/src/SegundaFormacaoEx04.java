public class SegundaFormacaoEx04 {
    public static void main(String[] args) {

        Carro infoCarro = new Carro();

        infoCarro.modelo = "Velocidade V8 Turbo";
        infoCarro.ano = 1978;
        infoCarro.cor = "Azulão Pena de Pavão";

        infoCarro.exibirFichaTecnica();

        int idade = infoCarro.idadeDoCarro(2025);
        System.out.printf("O carro tem %d anos.", idade);
    }
}

// Continua no Carro
