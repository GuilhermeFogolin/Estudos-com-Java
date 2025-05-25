package estudosProvaOficial;

import java.util.ArrayList;

public class PO_01_Sala {

    // Atributos

    private int num;

    private int capacidade;

    private ArrayList<PO_01_Sessao> sessoes;

    public int getNum() { return num; }

    public void setNum(int num) { this.num = num; }

    public int getCapacidade() { return capacidade; }

    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public ArrayList<PO_01_Sessao> getSessoes() { return sessoes; }

    public void setSessoes(ArrayList<PO_01_Sessao> sessoes) { this.sessoes = sessoes; }

    // Construtor

    public PO_01_Sala(int num, int capacidade) {
        this.num = num;
        this.capacidade = capacidade;
        this.sessoes = new ArrayList<>();
    }

    // Metodo para adicionar sessão

    public void addSessao(PO_01_Sessao s) {
        sessoes.add(s);
    }

}