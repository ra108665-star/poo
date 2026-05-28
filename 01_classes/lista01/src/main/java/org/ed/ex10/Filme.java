package org.ed.ex10;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private int avaliacao;

    public Filme(String titulo, String genero, int duracao, int avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Avaliação: " + avaliacao + "/10");
    }

    public void alterarAvaliacao(int novaAvaliacao) {
        avaliacao = novaAvaliacao;
        if (avaliacao > 10) {
            avaliacao = 10;
        } else if (avaliacao < 0) {
            avaliacao = 0;
        }
    }
}
