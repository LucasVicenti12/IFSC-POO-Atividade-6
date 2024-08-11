package org.ifsc.lucasvicenti.Exercicio4;

class Funcionario extends MembroEscola {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void realizarAcao() {
        trabalhar();
    }

    public void trabalhar() {
        System.out.println("Trabalhando como " + cargo);
    }
}

