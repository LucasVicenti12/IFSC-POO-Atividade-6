package org.ifsc.lucasvicenti.Exercicio4;

abstract class MembroEscola {
    protected String nome;

    public MembroEscola(String nome) {
        this.nome = nome;
    }

    public abstract void realizarAcao();

    public void mostrarInformacoes() {
        System.out.println("Nome -> " + nome);
    }
}

