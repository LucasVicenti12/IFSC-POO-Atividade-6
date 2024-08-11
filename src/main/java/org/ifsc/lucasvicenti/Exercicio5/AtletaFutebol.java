package org.ifsc.lucasvicenti.Exercicio5;

class AtletaFutebol extends Atleta {
    private String posicao;

    public AtletaFutebol(String nome, String posicao) {
        super(nome);
        this.posicao = posicao;
    }

    @Override
    public void treinar() {
        System.out.println("Treinando futebol na posição de " + posicao);
    }

    @Override
    public void competir() {
        System.out.println("Competindo em uma partida de futebol como " + posicao);
    }
}

