package org.example.ex14;

import java.util.ArrayList;

public class Main {
    static void main() {
        LivroDidatico[] array = new LivroDidatico[3];
        array[0] = new LivroDidatico("Head Java", "Kathy", "poo");
        array[1] = new LivroDidatico("Cálculo", "Stewart", "Calculus");
        array[2] = new LivroDidatico("C programming", "King", "ps");

        for (LivroDidatico book: array) {
            System.out.println(book);
            System.out.println();
        }

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new LivroDidatico("Sítio do Pica-pau", "Lobato", "Didático"));
        System.out.println(livros);

    }
}
