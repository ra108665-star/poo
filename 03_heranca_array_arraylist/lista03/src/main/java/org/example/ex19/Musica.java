package org.example.ex19;

public class Musica extends Midia{
    private String avaliacao;

    public Musica(String titulo, int ano, String avaliacao)
    {
        super(titulo, ano);
        this.avaliacao = avaliacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAvaliação: " +avaliacao;
    }
}
