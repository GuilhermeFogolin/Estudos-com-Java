package estudosProvaOficial;

public class PO_01_Sessao implements PO_01_IReservavel {

    // Atributos

    private String horario;

    private PO_01_Sala sala;

    private PO_01_Filme filme;

    public String getHorario() { return horario; }

    public void setHorario(String horario) { this.horario = horario; }

    public PO_01_Sala getSala() { return sala; }

    public void setSala(PO_01_Sala sala) { this.sala = sala; }

    public PO_01_Filme getFilme() { return filme; }

    public void setFilme(PO_01_Filme filme) { this.filme = filme; }

    // Construtor

    public PO_01_Sessao(String horario, PO_01_Sala sala, PO_01_Filme filme) {
        this.horario = horario;
        this.sala = sala;
        this.filme = filme;
        sala.addSessao(this);
    }

    // Interface

    @Override
    public void registrarReserva() {
        System.out.println("Registrado com sucesso!");
    }

    // Impressão

    public void print() {
        System.out.printf("Horario: %s" +
                "\nFilme: %s" +
                "\nSala: %s", horario, filme.getTitulo(), sala.getNum());
    }
}