package estudosProvaOficial;

public class PO_05_Localizacao {

    // Atributos

    private String rua;
    private String numero;
    private String cidade;

    // Acessos

    public String getRua() { return rua; }

    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }

    public void setNumero(String numero) { this.numero = numero; }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    // Construtor

    public PO_05_Localizacao(String rua, String numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }
}