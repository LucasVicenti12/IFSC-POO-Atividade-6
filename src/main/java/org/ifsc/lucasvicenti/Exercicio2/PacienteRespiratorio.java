package org.ifsc.lucasvicenti.Exercicio2;

public class PacienteRespiratorio extends Paciente {
    private int capacidadePulmonar;

    public PacienteRespiratorio(String nome, int capacidadePulmonar) {
        super(nome);
        this.capacidadePulmonar = capacidadePulmonar;
    }

    @Override
    public void monitaramento() {
        super.mostrarInformacoes();
        System.out.println("Monitorando paciente respiratorio");
        System.out.println("Capacidade pulmonar: " + capacidadePulmonar);
    }

    @Override
    public void tratamento() {
        super.mostrarInformacoes();
        System.out.println("Tratando paciente respiratorio");
    }
}
