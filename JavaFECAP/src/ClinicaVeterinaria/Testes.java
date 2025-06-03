package ClinicaVeterinaria;

public class Testes {

    public static void main(String[] args) {

        Cachorro cachorro   = new Cachorro("Apolo", "11/11/2022", "Cachorro", "Rottweilter");
        Tutor tutor         = new Tutor("Fogolim", "(11)949251312", "123", "São Paulo", cachorro);
        Veterinario vet     = new Veterinario("Carol", "(12)910235467", "321", "5456A-12", "Felinos");
        Procedimento pro1   = new Procedimento("Rotina", "Consulta normal", 100);
        Procedimento pro2   = new Procedimento("Raio-x", "Completo", 780.99);
        Consulta con        = new Consulta("02-02-2025", "Doente", cachorro, vet);
        con.addProcedimento(pro1);
        con.addProcedimento(pro2);
        con.print();
        cachorro.agendarConsulta(vet, "02-02-2025 11H30");
    }
}