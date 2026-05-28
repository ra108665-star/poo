package org.ed.ex08;

public class Main {
    static void main(String[] args) {
        Livro abc = new Livro();
        abc.setAutor("Eu");
        abc.setEmprestado();
        abc.setTitulo("ABC");

        Livro numeros = new Livro();
        numeros.setAutor("Eu");
        numeros.setEmprestado();
        numeros.setTitulo("NÚMEROS");

        abc.verificarDisponibilidade();
        abc.emprestarLivro();
        abc.verificarDisponibilidade();
        abc.devolverLivro();
        abc.verificarDisponibilidade();

        numeros.emprestarLivro();
        numeros.emprestarLivro();
        numeros.verificarDisponibilidade();
    }
}
