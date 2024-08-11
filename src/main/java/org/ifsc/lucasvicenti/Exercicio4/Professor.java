package org.ifsc.lucasvicenti.Exercicio4;

class Professor extends MembroEscola {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    @Override
    public void realizarAcao() {
        ensinar();
    }

    public void ensinar() {
        System.out.println("Ensinando a disciplina de " + disciplina);
    }
}
