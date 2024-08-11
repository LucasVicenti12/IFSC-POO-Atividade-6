package org.ifsc.lucasvicenti.Exercicio2;

public class PacienteDiabetes extends Paciente {
    private double nivelGlicose;

    public PacienteDiabetes(String nome, double nivelGlicose) {
        super(nome);
        this.nivelGlicose = nivelGlicose;
    }

    @Override
    public void monitaramento() {
        super.mostrarInformacoes();
        System.out.println("Monitorando paciente diabetes");
        System.out.println("Nível glicose: " + nivelGlicose);
    }

    @Override
    public void tratamento() {
        super.mostrarInformacoes();
        System.out.println("Tratando paciente diabetes");
    }
}
