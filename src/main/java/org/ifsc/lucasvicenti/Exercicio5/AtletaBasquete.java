package org.ifsc.lucasvicenti.Exercicio5;

class AtletaBasquete extends Atleta {
    private String posicao;

    public AtletaBasquete(String nome, String posicao) {
        super(nome);
        this.posicao = posicao;
    }

    @Override
    public void treinar() {
        System.out.println("Treinando basquete na posição de " + posicao);
    }

    @Override
    public void competir() {
        System.out.println("Competindo em uma partida de basquete como " + posicao);
    }
}
