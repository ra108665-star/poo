package org.example.ex09;

import java.util.ArrayList;

public class Nomes {
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionaNome(String nome) {
        nomes.add(nome);
    }

    public void exibirNomes() {
        System.out.println("Nomes: ");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
