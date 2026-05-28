package org.example.ex09;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Nomes lista = new Nomes();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome: ");
            String nome = scan.nextLine();

            lista.adicionaNome(nome);
        }
        System.out.println();
        lista.exibirNomes();
        scan.close();
    }
}
