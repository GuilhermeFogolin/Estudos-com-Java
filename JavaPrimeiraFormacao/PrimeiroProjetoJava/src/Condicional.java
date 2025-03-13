public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2020; // Inteira
        boolean incluidoNoPlano = true; // Variável booleana
        double notaDoFilme = 6.36; // Decimal
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme de lançamento! Fresquinho para ver.");
        } else {
            System.out.println("Filme mais antigo! Mas conquista corações ainda...");
        }

        if(incluidoNoPlano || tipoPlano.equals("Plus")){
            System.out.println("Filme fresquinho para você assistir!");
        } else {
            System.out.println("Poxa... Você tem que pagar a locação, belezinha?");
        }
    }
}
