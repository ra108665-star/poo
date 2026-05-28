package org.example.ex19;

public class Podcast extends Midia{
    private int duracao;

    public Podcast(String titulo, int ano, int duracao) {
        super(titulo, ano);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDuração: " +duracao +" minutos";
    }
}
