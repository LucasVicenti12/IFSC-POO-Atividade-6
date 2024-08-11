package org.ifsc.lucasvicenti.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Personagem personagem1 = new Mago();
        personagem1.atacar();

        Personagem personagem2 = new Guerreiro();
        personagem2.atacar();

        Personagem personagem3 = new Arqueiro();
        personagem3.atacar();
    }
}
