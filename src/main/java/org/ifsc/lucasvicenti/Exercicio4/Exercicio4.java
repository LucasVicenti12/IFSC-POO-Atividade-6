package org.ifsc.lucasvicenti.Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        MembroEscola m1 = new Professor("Lucas", "Matemática");
        MembroEscola m2 = new Aluno("Mateus", "Engenharia");
        MembroEscola m3 = new Funcionario("Joao", "Bibliotecário");

        m1.mostrarInformacoes();
        m1.realizarAcao();

        m2.mostrarInformacoes();
        m2.realizarAcao();

        m3.mostrarInformacoes();
        m3.realizarAcao();
    }
}
