package org.ifsc.lucasvicenti.Exercicio5;

abstract class Atleta {
    protected String nome;

    public Atleta(String nome) {
        this.nome = nome;
    }

    public abstract void treinar();

    public abstract void competir();

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
    }
}

