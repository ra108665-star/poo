package org.example.ex17;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new ContatoPessoal("Jose", "1234"));
        contatos.add(new ContatoProfissional("Alex", "9876"));

        for (Contato contato: contatos) {
            System.out.println(contato);
            System.out.println();
        }

        for (Contato contato : contatos) {

            if (contato instanceof ContatoProfissional) {
                System.out.println(contato);
            }
        }
    }
}
