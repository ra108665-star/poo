package org.example.ex10;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("alface", 1.00f));
        produtos.add(new Produto("banana", 2.00f));
        produtos.add(new Produto("cafe", 50.00f));
        produtos.add(new Produto("damasco", 20.00f));
        produtos.add(new Produto("etanol", 5.00f));

        for (int i = 0; i < 5; i++) {
            System.out.println(produtos.get(i));
        }

        Produto maisCaro = produtos.get(0);

        for (int i = 1; i < 5; i++) {

            if (produtos.get(i).getPreco() > maisCaro.getPreco()) {
                maisCaro = produtos.get(i);
            }
        }

        System.out.println("Produto mais caro:");
        System.out.println(maisCaro);
    }
}
