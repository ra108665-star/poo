package org.ed.ex15;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponivel;

    public LivroBiblioteca(String titulo, String autor, int codigo, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }

    public void exibirInformacoes() {
        System.out.println( "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo=" + codigo +
                ", disponivel=" + disponivel +
                '}' );
    }
}
