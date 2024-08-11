package org.ifsc.lucasvicenti.Exercicio4;

class Aluno extends MembroEscola {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void realizarAcao() {
        estudar();
    }

    public void estudar() {
        System.out.println("Estudando para o curso de " + curso);
    }
}

