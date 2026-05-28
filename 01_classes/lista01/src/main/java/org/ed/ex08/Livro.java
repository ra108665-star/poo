package org.ed.ex08;

public class Livro {
    private String titulo;
    private String autor;
    private Boolean emprestado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado() {
        this.emprestado = false;
    }

    public void emprestarLivro(){
        if (!emprestado){
            emprestado = true;
            System.out.println("O livro " + titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + titulo + " está indisponível.");
        }
    }

    public void devolverLivro() {
        emprestado = false;
        System.out.println("O livro " + titulo + " foi devolvido.");
    }

    public void verificarDisponibilidade() {
        if (!emprestado){
            System.out.println("O livro " + titulo + " está disponível.");
        } else {
            System.out.println("O livro " + titulo + " está indisponível.");
        }
    }
}
