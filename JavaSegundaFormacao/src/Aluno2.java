public class Aluno2 {

    private String nomeAluno;
    private double n1;
    private double n2;
    private double n3;

    public Aluno2(String nomeAluno, double n1, double n2, double n3) {
        this.nomeAluno = nomeAluno;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // Acessar

    public String getNomeAluno() { return nomeAluno; }

    public double getN1() { return n1; }

    public double getN2() { return n2; }

    public double getN3() { return n3; }

    // Modificar

    public void setNomeAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }

    public void setN1(double n1) { this.n1 = n1; }

    public void setN2(double n2) { this.n2 = n2; }

    public void setN3(double n3) { this.n3 = n3; }

    // Métod_o

    public double calcularMedia() {
        return (n1 + n2 + n3) / 3.0;
    }
}

// Continua no Ex09