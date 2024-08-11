package org.ifsc.lucasvicenti.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Paciente paciente1 = new PacienteCardiovascular("Lucas", 12);

        paciente1.tratamento();
        paciente1.monitaramento();

        Paciente paciente2 = new PacienteDiabetes("Mateus", 90);

        paciente2.tratamento();
        paciente2.monitaramento();

        Paciente paciente3 = new PacienteRespiratorio("Joao", 10);

        paciente3.tratamento();
        paciente3.monitaramento();
    }
}
