package org.example.ex19;

public class Filme extends Midia{
    private int visualizacoes;

    public Filme(String titulo, int ano, int visualizacoes) {
        super(titulo, ano);
        this.visualizacoes = visualizacoes;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nVisualizações: " +visualizacoes;
    }
}
