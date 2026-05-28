package org.example.ex19;

import java.util.ArrayList;

public class Main {
    static void main () {
        ArrayList<Midia> midias = new ArrayList<>();

        midias.add(new Filme("Bambi", 1942, 100000000));
        midias.add(new Musica("Kingslayer", 2020, "excelente"));
        midias.add(new Podcast("Cortes", 2025, 120));

        for (Midia midia: midias){
            System.out.println(midia);
            System.out.println();
        }

        System.out.println("Só filmes");
        for (Midia midia: midias){
            if (midia instanceof Filme) {
                System.out.println(midia);
                System.out.println();
            }
        }

        int qtdFilmes = 0, qtdMusicas = 0, qtdPodcasts = 0;
        for (Midia midia : midias) {
            if (midia instanceof Filme) {
                qtdFilmes++;
            }
            else if (midia instanceof Musica) {
                qtdMusicas++;
            }
            else {
                qtdPodcasts++;
            }
        }
        System.out.println("Quantidade de filmes: " + qtdFilmes);
        System.out.println("Quantidade de músicas: " + qtdMusicas);
        System.out.println("Quantidade de podcasts: " + qtdPodcasts);
    }
}
