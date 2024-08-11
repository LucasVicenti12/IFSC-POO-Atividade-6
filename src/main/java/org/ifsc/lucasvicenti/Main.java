package org.ifsc.lucasvicenti;

import org.ifsc.lucasvicenti.Exercicio1.Arqueiro;
import org.ifsc.lucasvicenti.Exercicio1.Guerreiro;
import org.ifsc.lucasvicenti.Exercicio1.Mago;
import org.ifsc.lucasvicenti.Exercicio1.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Mago();
        personagem1.atacar();

        Personagem personagem2 = new Guerreiro();
        personagem2.atacar();

        Personagem personagem3 = new Arqueiro();
        personagem3.atacar();
    }
}