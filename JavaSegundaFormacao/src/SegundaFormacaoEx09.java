public class SegundaFormacaoEx09 {
    public static void main(String[] args) {

        Aluno2 aluno = new Aluno2("Guilherme Fogolin", 9.78, 6.65, 7.97);

        System.out.println("Nome do aluno: " + aluno.getNomeAluno() + ".");
        System.out.println("Nota N1 do " + aluno.getNomeAluno() + " vale " + aluno.getN1() + ".");
        System.out.println("Nota N2 do " + aluno.getNomeAluno() + " vale " + aluno.getN2() + ".");
        System.out.println("Nota N3 do " + aluno.getNomeAluno() + " vale " + aluno.getN3() + ".");
        System.out.printf("Portanto, sua média vale %.2f.", aluno.calcularMedia());
    }
}
