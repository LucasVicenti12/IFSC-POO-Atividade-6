package org.ifsc.lucasvicenti.Exercicio2;

public abstract class Paciente {
    protected String nome;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public abstract void tratamento();

    public abstract void monitaramento();

    public void mostrarInformacoes(){
        System.out.println("Paciente -> " + this.nome);
    }
}
