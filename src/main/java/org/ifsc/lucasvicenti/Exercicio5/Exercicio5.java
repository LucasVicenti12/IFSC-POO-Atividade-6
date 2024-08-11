package org.ifsc.lucasvicenti.Exercicio5;

public class Exercicio5 {
    public static void main(String[] args) {
        Atleta a1 = new AtletaFutebol("Lucas", "Atacante");
        Atleta a2 = new AtletaBasquete("Mateus", "Armador");
        Atleta a3 = new AtletaNatacao("Joao", "Borboleta");

        a1.mostrarInformacoes();
        a1.treinar();
        a1.competir();

        a2.mostrarInformacoes();
        a2.treinar();
        a2.competir();

        a3.mostrarInformacoes();
        a3.treinar();
        a3.competir();
    }
}
