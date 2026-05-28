package org.ed.ex05;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void exibirDados() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor: " + autor);
        isbn.exibirDados();
    }
}
