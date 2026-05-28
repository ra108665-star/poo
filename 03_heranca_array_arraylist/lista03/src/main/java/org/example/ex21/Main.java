package org.example.ex21;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoFisico("PC", 1000.0f, 1));
        produtos.add(new ProdutoDigital("Virus", 100.0f, 100));

        float preco_total = 0.0f;
        System.out.println("Produtos");
        for (Produto produto: produtos) {
            System.out.println(produto);
            System.out.println();

            preco_total += produto.getPreco();
        }
        System.out.println("Preço total R$" +preco_total);
        System.out.println();

        System.out.println("Produtos físicos");
        for (Produto produto: produtos) {
            if (produto instanceof ProdutoFisico) {
                System.out.println(produto);
                System.out.println();
            }
        }

        System.out.println("Produtos digitais");
        for (Produto produto: produtos) {
            if (produto instanceof ProdutoDigital) {
                System.out.println(produto);
                System.out.println();
            }
        }
    }
}
