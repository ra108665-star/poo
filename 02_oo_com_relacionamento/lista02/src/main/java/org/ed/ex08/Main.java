package org.ed.ex08;

public class Main {
    static void main (String[] args) {
        Endereco end = new Endereco("Vitoria", 99, "Esperança", "Maringá");
        Casa home = new Casa("Roxo", 4, end);

        home.exibirCasa();
    }
}
