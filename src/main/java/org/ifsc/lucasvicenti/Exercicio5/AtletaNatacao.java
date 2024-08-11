package org.ifsc.lucasvicenti.Exercicio5;

class AtletaNatacao extends Atleta {
    private String estilo;

    public AtletaNatacao(String nome, String estilo) {
        super(nome);
        this.estilo = estilo;
    }

    @Override
    public void treinar() {
        System.out.println("Treinando natação no estilo " + estilo);
    }

    @Override
    public void competir() {
        System.out.println("Competindo em uma prova de natação no estilo " + estilo);
    }
}

