package org.ifsc.lucasvicenti.Exercicio2;

public class PacienteCardiovascular extends Paciente {
    private double pressaoAlterial;

    public PacienteCardiovascular(String nome, double pressaoAlterial){
        super(nome);
        this.pressaoAlterial = pressaoAlterial;
    }

    @Override
    public void monitaramento() {
        super.mostrarInformacoes();
        System.out.println("Monitorando paciente cardiovascular");
        System.out.println("Pressão arterial: " + pressaoAlterial);
    }

    @Override
    public void tratamento() {
        super.mostrarInformacoes();
        System.out.println("Tratando paciente cardiovascular");
    }
}
