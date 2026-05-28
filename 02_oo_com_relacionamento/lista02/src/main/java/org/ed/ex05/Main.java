package org.ed.ex05;

public class Main {
    static void main(String []args) {
        ISBN isbn = new ISBN(456, "Marvel");
        Livro biblia = new Livro("Bíblia", "Apóstolos", isbn);

        biblia.exibirDados();
    }
}
